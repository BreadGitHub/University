def func(N):
    sum = 0
    if N <= 0:
        print("Nope")
        exit()
    for i in range(0,N+1):
        sum = i**3
        print(sum)
func(N = int(input("How many namubers?:")))
