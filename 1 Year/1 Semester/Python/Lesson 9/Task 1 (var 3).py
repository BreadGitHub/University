def matrix(n):
    #n = int(input('Size XY:'))
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
    
    global ans
    
    if check != 0:  
        print("No")                               #Окончательный ответ
        ans = 'this matrix is not symmetrical'
    else:
        print("Yes")
        ans = 'this matrix is symmetrical'
    
    return N1
def output(m):
    with open('output.txt','w') as file:
        for line in m:
            for elem in line:
                file.write(str(elem) + ' ')
            file.write('\n')
        file.write(ans)
n2 = int(input('Size XY:'))
output(matrix(n2))