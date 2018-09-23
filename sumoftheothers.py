import sys
def get_sum_value(numbers):
    for index in range(0,len(numbers)):
        sum = int(numbers[index])
        total = 0
        for val in range(0,len(numbers)):
            if val != index:
                total = total + int(numbers[val])
        if sum == total:
            return sum
for val in sys.stdin:
    print(get_sum_value(val.split()))