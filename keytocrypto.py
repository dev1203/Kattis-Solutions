def asciiCalculate(charc, index):
    charCode = ord(charc)
    for val in range(0, index):
        if charCode - 1 < 65:
            charCode = 90
        else:
            charCode = charCode - 1
    return chr(charCode)
        
encrypt = list(input().strip())
key = list(input().strip())
s ='abcdefghijklmnopqrstuvwxyz'.upper()
alphabets = list(s)
value = []
count = 0
for i in range(0, len(encrypt)):
    a = asciiCalculate(encrypt[count],alphabets.index(key[i]))
    print(a, end = "")
    key.append(a)
    count = count + 1
print()