testcase = int(input())
days = input().split()
count = 0
for val in days:
    if int(val) < 0:
        count = count + 1
print(count)        