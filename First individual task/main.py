import requests
from bs4 import BeautifulSoup
import os

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