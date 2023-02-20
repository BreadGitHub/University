def func(n):
    n1 = 1
    n2 = 1
    i = 0
    result = 0
    
    while i < n-2:  #Чтобы наперед не забегал
        fsum = n1 + n2  
        n1 = n2
        n2 = fsum     
        i +=1                 # 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
        result += n2
    print("Сумма: ", result+2)     
func(n = int(input("Количество чисел: ")))