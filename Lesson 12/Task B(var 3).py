def order(n):
    if n != 0:
        if n % 2:
            print('', n)
            order(n-1)
        else:
            order(n-1)

order(10) #Выводит 9 7 5 3 1 (сверху вниз)
                    
