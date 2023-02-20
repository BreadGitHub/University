def func():
    n = 0             # ЧИСЕЛ
    sm = 0            # СУММА
    sr = 0            # ОТВЕТ
    check = True
    while check:
        N = int(input("Number:"))
        if N == 0:
            check = False
        else:
            sm = sm + N             
            n = n + 1
    sr = sm/n         # <----- СУММУ ЧИСЕЛ ПОДЕЛИТЬ НА КОЛИЧЕСТВО!
    print(sr)
func()