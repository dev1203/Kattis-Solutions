testcafe = int(input())
for val in range(0,testcafe):
    text = input()
    if 'Simon says' in text:
        print(text.split('Simon says')[1])