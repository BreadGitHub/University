N = int(input("Number:"))
i = 2
Check = True
while Check:
    if N < 2:
        print("N not less than 2!", "Print Again!")    # <--- Я научился повторять условие!
        N = int(input("Number:"))
    else:
        Check = False
while i <= N:
    if N%i == 0:
        print(i)
        break
    i += 1
    