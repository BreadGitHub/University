def matrix(): 
    n = int(input("Size XY:"))
    N1 = []
    for i in range(n):
        N2 = []
        for i in range(n): 
            N2.append((input("array num:")))
        N1.append(N2)  

    for i in range(n):
            for j in range(n):
                print(N1[j][i], end = ' ')             #Выводит матрицу
            print()
    
    mx = N1[0][0]
    for i in range(n):
        for j in range(n):     #Максимальное значение в принципе
            if mx < N1[i][j]:
                mx = N1[i][j]
    print("Max num:", mx)

    j2 = 0
    i2 = 0
    mx = N1[0][0]

    for i in range(n):
        for j in range(n):
            if N1[i][j] > mx:
                mx = N1[i][j]
                i2 = i
                j2 = j
    N1[0], N1[i2] = N1[i2], N1[0]
    N1[0][0], N1[0][j2] = N1[0][j2], N1[0][0]
    
    for i in range(n):
            for j in range(n):
                print(N1[j][i], end = ' ')             #Выводит матрицу
            print()
    
            
matrix()