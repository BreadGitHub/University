def reverse(n):
    #n = int(n)
    if n != 0:
        return str(n%10) + reverse(n//10)   #Переворот
    else:
        return ''
        
print(reverse(453))