n = int(input("Array length:"))
N = [ ]
sum = 0
for i in range(n):
    print("Enter the", i, "element")
    N.append(int(input(i)))
print("Array:", N)
for i in range(n):
    if N[i] % 2 != 0:
        sum += N[i]
        print("odd:", N[i])
print("sum:", sum)