# 4
# 4 3 3 2
# add the difference to the max
# if number = legnth 
#     don't add
minimum_days = int(input())
initial_days = minimum_days
order = input().strip().split()
order.sort(reverse = True)
for val in order:
    minimum_days = minimum_days - 1
    if int(val) > minimum_days:
        initial_days = initial_days + abs(int(val)- minimum_days + 1)
        minimum_days = minimum_days + abs(int(val) - minimum_days + 1)
print(initial_days)