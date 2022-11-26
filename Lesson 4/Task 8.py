def func(N):
    k = ''   #Строка
    for i in range(1, N+1):
        k = k + str(i)
        print(k)
func(N = int(input("How many numbers?:")))
