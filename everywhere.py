testcase = int(input())
for val in range(0, testcase):
    cities = int(input())
    myset = set()
    for val in range(0, cities):
        myset.add(input())
    print(len(myset))