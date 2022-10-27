y = int()
if (y % 4 == 0 and not y % 100 ==0) or (y % 400 == 0):
    print('Год Високосный')
else:
    print('Год не Високосный')
