testcase = int(input())
def sum_of_number(number):
    number = str(number)
    sum = 0
    for value in number:
        sum = sum + int(value)
    return sum
def find_number(number, sum_required):
    while True:
        if sum_of_number(number) == sum_required:
            return number
        else:
            number = number - 1
for val in range(0,testcase):
    number = int(input())
    sum_required = sum_of_number(number) - 1
    if sum_required == 0:
        print("0")
    else:
        print(find_number(number,sum_required))