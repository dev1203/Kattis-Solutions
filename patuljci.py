import sys
num = []
sum = 0
for val in sys.stdin:
    sum += int(val)
    num.append(int(val.strip()))
extra = abs(100 - sum)
for val in num:
    first_num = val
    to_find = abs(extra - first_num)
    if to_find in num:
        num.remove(to_find)
        num.remove(first_num)
        break
for val in num:
    print(val)