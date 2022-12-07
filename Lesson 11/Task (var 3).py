import requests
import json
from tkinter import *
from pprint import pprint


def GET():
    
    win = Tk()
    win.geometry(f'500x300')
    win.title('Task ')
    win.resizable(False, False)
    #win["bg"] = "#FFF"
    
    user = 'kubernetes'
    username = Label(win, borderwidth = 4, text = user,font = ("Times new Roman", 15), fg = 'black')
    username.grid(column = 2, row = 1)
    
    
    #def deleteincorrect():
        #username.delete(0, 999)
    
    
    def clicked():
        
        url = f'https://api.github.com/users/{user}'
        user_data = requests.get(url).json()
        pprint(user_data)
        
        file = open('User_data.txt', 'w')
        file.write(str(user_data))
        file.close()
        win.destroy()
    
    btn = Button(win, text = 'PRESS', fg = 'blue', command = clicked,borderwidth = 4)
    btn.grid(column = 4, row = 1, stick = 'w')
    
    #btn2 = Button(win, text = 'DELETE', fg = 'blue', command = deleteincorrect,borderwidth = 4)
    #btn2.grid(column = 4, row = 2, stick = 'w')
    
    
    lbl = Label(win, text = 'Username:', font = ("Times new Roman", 15), fg = 'blue')
    lbl.grid(column = 1, row = 1)     
    #answer()
    win.mainloop()
    
GET()