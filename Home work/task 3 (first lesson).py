age = int(input("Age:"))
i = 16 - age
if 16 <= age < 75: print("Вы можете поступить в ВУЗ")
else: 
    if 0 < age < 16: print("Вы не можете поступить в ВУЗ, подождите", i, "лет") 
    else: 
        if age == 0: print("Сначала родись")
        if age >= 75: print("Поздновато, не?")
