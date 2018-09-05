import sys
data = input().split()
number = []
for value in data:
    number.append(int(value))
number.sort()
one = (number[1]-number[0])
if(one + number[1]) not in number:
    print(one + number[1])
else:
    print(one + number[2])