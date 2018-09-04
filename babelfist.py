import sys
question = []
flag = 0
dict = {}

for line in sys.stdin:
    if(line == '\n'):
        flag = 1
    elif(flag == 0):
        dict[line.rstrip().split()[1]] = line.rstrip().split()[0]
    else:
        question.append(line.rstrip())
  
for value in question:
    if(dict.get(value)):
        print(dict.get(value))
    else:
        print("eh")

