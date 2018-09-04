import sys
data = input().split()
number = []
for value in data:
    number.append(int(value))
number.sort()
print((number[1]-number[0])+number[1])
