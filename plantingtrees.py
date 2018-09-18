# 4 3 3 2
# sort then desc
# add the difference to the max
# if number = legnth 
#     don't add
minimum_days = int(input())
order = input().strip().split()
order.sort(reverse = True)
for val in order:
    if int(val) > minimum_days:
        print('if val is' + val)
        minimum_days = minimum_days + (int(val) - minimum_days)
    else:
        print('else val is'+ val)
        minimum_days = minimum_days -1
print(minimum_days)