def send_pattern_dot(length):
    str = ""
    for val in range(0,length):
        if val%2 == 0:
            str= str+"."
        else:
            str= str+"#"
    return str
def send_pattern_hash(length):
    str = ""
    for val in range(0,length):
        if val%2 == 0:
            str= str+"#"
        else:
            str= str+"."
    return str
def make_matrix(matrix, width, length):
    for val in range(0, length):
        if val % 2 == 0:
            matrix.append(list(send_pattern_hash(width)))
        else:
            matrix.append(list(send_pattern_dot(width)))
def add_word(matrix,word,index,length,left_padding):
    for val in range(0,length):
        matrix[index][left_padding+val] = word[val]
first_line = input().strip().split()
number_of_words = int(first_line[0])
number_of_chars = int(first_line[1])
frame = input().strip().split()
upper_padding = int(frame[0])
left_padding = int(frame[1])
right_padding = int(frame[2])
down_padding = int(frame[3])
matrix = []
word = []
for val in range(0,number_of_words):
    word.append(input())
width = number_of_chars + left_padding + right_padding
length = number_of_words + upper_padding + down_padding
make_matrix(matrix,width,length)
for val in range(0,len(word)):
    add_word(matrix,word[val],upper_padding+val,len(word[val]),left_padding)
for i in matrix:
    for j in i:
        print(j, end="")
    print()