#Вариант 3
def func(txt):
    text = ''
    n = 0
    for i in range(len(txt)):
            if txt[i] == ".":
                print(txt.replace('a', ''))
                n += 1

            else:
                text += txt[i]
    print(n)
    print(text)
func(txt = input("Write the text:"))
