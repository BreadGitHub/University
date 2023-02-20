N = int(input("Number:"))
i = 2
exp = 1 # <---- Степень двойки



while i <= N:
    i *= 2
    exp += 1
exp -=1
print(exp)