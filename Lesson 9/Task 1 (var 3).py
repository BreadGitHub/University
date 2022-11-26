def matrix(n):
    N1 = []
    for i in range(n):
        N2 = []
        for i in range(n): 
            N2.append((input("array num:")))
        N1.append(N2)       #Заполняет матрицу
    check = 0
    for i in range(n):
        for j in range(n):
            print(N1[j][i], end = ' ')             #Выводит матрицу
        print()

    for i in range(n):
        for j in range(n):
            if N1[i][j] != N1[j][i]:                #Проверяет матрицу
                check += 1
    
    
    if check != 0:  
        print("No")                               #Окончательный ответ
    else:
        print("Yes")


matrix(n = int(input("XY:")))

