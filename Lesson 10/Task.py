file_output = open('results', 'w')   #Заранее создаем файл с ответами
file_output.close()
file_input = open('data', 'w+')
file_input.write('3100010001_3987587545') #Заранее создаем файл с вводимыми данными
file_input.close()



def matrix1():
    file_input = open('data').readlines()
    n = int(file_input.read(1))
    file_input.close()
    N1 = []
    for i in range(n):
        N2 = []
        for i in range(n): 
            
            #N2.append(int(k) for k in range(1,10))
            
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
        file_output = open('results', 'a')
        file_output.write('No')
        file_output.close()
    elif check == 0:
        print("Yes")
        file_output = open('results', 'a')
        file_output.write('No')
        file_output.close()         




















def matrix2(): 
    file_input = open('data', 'r')
    n = int(file_input.read(1))  
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
    
    file_output = open('results', 'a')
    
    for i in range(n):
            for j in range(n):
                print(N1[j][i], end = ' ')             #Выводит матрицу
                file_output.write(N1[j][i])
            print()
    file_output.close()

matrix1()