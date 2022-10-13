N = input("How many namubers?:")
N = int(N)
sum = 0
if N <= 0:
    print("Nope")
    exit()
for i in range(0,N+1):
    sum = i**3
    print(sum)