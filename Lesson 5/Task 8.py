def func():
    N = int(input("First Number:"))
    i = 0 # счетчик
    n = 1
    check = True
    while check:
        N2 = int(input("Number:"))
        if N2 != 0:
            if N2 == N:
                i += 1
            else:
                if i > n:
                    i=n
                N = N2
                i = 0
        else:
            break
    print(i)
func()   
