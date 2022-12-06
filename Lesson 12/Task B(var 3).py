def order(n):
    if n != 0:
        if n % 2:
            print('', n)
            order(n-1)
        else:
            order(n-1)

order(10)