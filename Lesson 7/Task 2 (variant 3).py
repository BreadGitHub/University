N = [ ]
for i in range(8):
    print("Enter the", i, "element")
    N.append(int(input(i)))
    if N[i] < 15:
        while N[i] < 15:    #Даже слишком легкое задание, я сделал его даже без исправлений
            N[i] *= 2
print("Array: ", N)