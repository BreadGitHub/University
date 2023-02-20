N = input("How many numbers?:")
N=int(N)
sum = 0   #Вычислить сумму 1!+2!+3!+4!...N!
k = 1   #Прошлый факториал
for i in range(1, N+1):    #Только 1 for 
    j = k * i  
    sum += j     # ПАМЯТКА: 5! = 4! * 5 = 1 * 2 * 3 * 4* 5 
    k = j
print(sum)