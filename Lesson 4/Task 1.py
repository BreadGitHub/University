def func(A,B):
    for i in range(A, B+1): #Вывести от А до В, ключая B
        if not i%2 == 0:
            print("Uneven number:", i)  
    
func(A = int(input("A=")), B = int(input("B=")))   
    
