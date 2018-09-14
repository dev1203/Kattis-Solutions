import sys
import math
def find_right_agled(numbers):
    max_value = max(numbers)
    numbers.remove(max_value)
    if max_value*max_value == (numbers[0]*numbers[0] + numbers[1]*numbers[1] ):
        print('right')
    else:
        print('wrong')
for line in sys.stdin:
    if line.rstrip() != '0 0 0':
        numbers = line.split()
        numbers = [int(values) for values in numbers]
        find_right_agled(numbers)