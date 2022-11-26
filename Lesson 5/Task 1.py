def func(N):
    n = 1  #   <---Он должен выводить это!
    while N >= n**2:
        print(n**2)
        n = n+1
func(N = int(input("Number:")))
