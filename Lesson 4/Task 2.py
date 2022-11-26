def func(A,B):
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

func(A = int(input("A=")), B = int(input("B=")))
