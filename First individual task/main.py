import requests
from bs4 import BeautifulSoup
import os
from argparse import ArgumentParser
import sys
session = requests.Session()
headers = {
    'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36'
}

proxies = {
    'https': 'http://198.59.191.234:8080',
    'http': 'http://198.59.191.234:8080',
    'ftp': 'http://198.59.191.234:8080'
}

url1 = 'https://2ip.ru'
response = requests.get(url1, headers=headers, proxies=proxies, timeout=10, verify=False)
soup = BeautifulSoup(response.text, 'lxml')
ip = soup.find('div', class_='ip').text
loc = soup.find('div', class_='value-country').text
print(f'IP:{ip}\nLocation: {loc}')
print('Proxy active')

url2 = 'https://rutracker.org/forum/login.php'
USERNAME = 'Testrequests'  # input('Account Login: ')
PASSWORD = '12345678test'  # input('Account Password: ')
data = {
        'login_username': USERNAME,
        'login_password': PASSWORD,
        'login': 'pushed',
        'redirect': 'index.php'
}

l_response = session.post(url2, headers=headers, data=data, proxies=proxies, verify=False)
print(l_response.content.decode('utf8'))
print('Auth')

seek = input("Search: ")
url = f'https://rutracker.org/forum/tracker.php?nm={seek}'
response = requests.get(url, headers=headers, proxies=proxies, verify=False).text
soup = BeautifulSoup(response, 'html.parser')
print(soup.find_all('tr', class_='tCenter')[2])

def argument_parser():
    parser = ArgumentParser(description="Search and download torrents on the rutracker.org")
    parser.add_argument('name', metavar='SEARCH')
    parser.add_argument('-c', '--count', default=5, type=int)
    group = parser.add_mutually_exclusive_group()
    group.add_argument('--no-download', action='store_false')
    group.add_argument('--no-run-torrent', action='store_false')

    return parser

def input_rutracker_id(max_result):
    try:
        rutracker_id = int(input('Dowload ID: '))
    except ValueError:
        print ('ERROR:', "That was not a valid number\n")
        sys.exit(1)

    if rutracker_id > max_result:
        print("ERROR: Values for downloading should be less than the total number\n")
        sys.exit(1)

    return rutracker_id




thisFile = "file.html"
base = os.path.splitext(thisFile)[0]
os.rename(thisFile, base + ".txt")
with open('file.txt', 'w') as f:
    f.write(l_response.content.decode('cp1251'))

thisFile = "file.txt"
base = os.path.splitext(thisFile)[0]
os.rename(thisFile, base + ".html")

# try:
#     
# except:
#     print('Error.')
