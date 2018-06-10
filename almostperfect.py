import sys

contents = []
while True:
    try:
        line = int(input())
    except EOFError:
        break
    contents.append(line)
for i in contents:
	sum=0
	for j in range(1,int(i/2)+1):
		if i%j ==0:
			sum=sum+j
	if sum==i:
		print(str(i)+" perfect")
	elif (sum+2 ==i or sum-2 ==i):
		print(str(i)+" almost perfect")
	else:
		print(str(i)+" not perfect")



