def go_postivie(current,desired):
    for val in range(0,360):
        if current == desired:
            return val
        if current >= 359:
            current = 0
        else:
            current = current + 1
def go_negative(current, desired):
    for val in range(-360,):
        if current == desired:
            return val
        if current == 0:
            current = 359
        else:
            current = current + 1  

current = int(input())
desired = int(input())
positive = go_postivie(current, desired)
negative = go_negative(current, desired)
if positive == 181:
    print(180)
elif negative == None:
    print(positive)
elif abs(positive) > abs(negative):
    print(negative)
else:
    print(positive)