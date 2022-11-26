def func(x,y): 
    i = 1 # Дни
    x = float(x)
    y = float(y)
    while x <= y:
        x *= 1.1
        i += 1
    print(i)
func(x = input("First Day km:"),y = input("Goal:"))
