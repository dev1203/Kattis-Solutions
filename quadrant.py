xValue = int(input())
yValue = int(input())
if xValue > 0 and yValue > 0:
    print("1")
elif xValue < 0 and yValue > 0:
    print("2")
elif xValue < 0 and yValue < 0:
    print("3")
else:
    print("4")