txt = input("Write text:").lower().split('')
for i in range(len(txt)):
    txt[i]: ''.join(sorted(txt[i]))
print('ss'.join(txt))