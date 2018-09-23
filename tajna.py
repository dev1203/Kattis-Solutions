def find_row(length):
    li = []
    for i in range(0, int(length/2)):
        for j in range(0,length+1):
            if i * j == length:
                li.append([i,j])
    return li[len(li)-1][1]
word = input()
length = len(word)
num_row = find_row(length)
matrix = []
for val in range(0,num_row):
    matrix.append(list(word[:num_row]))
    word = word[num_row:]
for i in range(0,len(matrix)):
    for j in range(0,len(matrix[i])):
        print(matrix[j][i], end="")
print()