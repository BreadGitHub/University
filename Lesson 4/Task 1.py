A = input("Number 1:")
B = input("Number 2:")
A = int(A)  #Я долго до этого допирал
B = int(B)
for i in range(A, B+1): #Вывести от А до В, ключая B
    if not i%2 == 0:
        print("Uneven number:", i)  
    
    