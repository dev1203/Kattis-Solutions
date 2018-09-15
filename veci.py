import itertools
number = input().strip()
numbers = set(itertools.permutations(number))
all_values = []
for value in numbers:
    num = int(''.join(map(str,value)))
    if num > int(number):
        all_values.append(num)
if not all_values:
    print(0)
else:
    all_values.sort()
    print(all_values[0])
