age = int(input("Age:"))
name = input("Your name is: ")
if name != 'Ivan':
        i = 16 - age
        if 16 <= age < 75: print(name,", Вы можете поступить в ВУЗ")
        else: 
            if 0 < age < 16: print(name,", Вы не можете поступить в ВУЗ, подождите", i, "лет") 
            else: 
                if age == 0: print("Сначала родись")
                if age >= 75: print("Поздновато, не?")
else:
    print("Это место не для таких как ТЫ!")
