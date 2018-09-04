import sys
data = []
lines = []
def get_room():
    if(data[0]==data[1]):
        print("too late")
        return
    else:
        test = list(range(101))
    for i in lines:
        test.remove(int(i))
    print(test[1])

for line in sys.stdin:
    lines.append(line.rstrip())
data = lines[0].split()
lines.pop(0)
get_room()

