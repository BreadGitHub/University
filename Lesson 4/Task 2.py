A = input("Number 1:")
B = input("Number 2:")
A = int(A)
B = int(B)
if A < B:
    try:
        for i in range(A, B + 1):
            print(i)
    except ValueError:
        print("Please, write the numbers")
else:
    try:
        for i in range(A, B-1, -1):
            print(i)
    except ValueError:
        print("Please, write the numbers")