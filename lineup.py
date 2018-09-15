number = int(input())
lines = []
for line in range(0,number):
    lines.append(input().strip())
if lines == sorted(lines):
    print ('INCREASING')
elif lines == sorted(lines, reverse = True):
    print ('DECREASING')
else:
    print('NEITHER')
