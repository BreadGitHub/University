x = input("First Day km:")   # В первый день пробежал
y = input("Goal:")   # Не менее у километров
i = 1 # Дни
x = float(x)
y = float(y)
while x <= y:
    x *= 1.1
    i += 1
print(i)

