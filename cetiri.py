import sys
def find_number(number, difference):
    for value in number:
        if value + difference not in number:
            print(value + difference)
            return
            

data = input().split()
number = []
for value in data:
    number.append(int(value))
number.sort()
difference = number[1] - number[0]
find_number(number,difference)