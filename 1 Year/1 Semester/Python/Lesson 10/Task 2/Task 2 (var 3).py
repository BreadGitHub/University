def matrix(): 
    global N1
    with open('input.txt','r') as file:
        N1 = [list(map(int,row.split())) for row in file.readlines()] #Заполняет матрицу 

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
    return N1
def output(m):
    with open('output.txt','w') as file:
        for line in m:
            for elem in line:
                file.write(str(elem) + ' ')
            file.write('\n')
n = int(3)
output(matrix())