def func():    
    check1 = True
    while check1:
        N = int(input("First Number:"))   #Самое первое число
        if N != 0:
            i = 0
            check2 = True
            while check2:
                N2 = int(input("Number:"))
                if N2 == 0:
                    check2 = False
                    break   
                else:
                    if N < N2:
                        i += 1
                print(i)     # Сколько чисел больше 1-го числа
        else:
            print("First number is NOT 0")
        break
func()

       
        

