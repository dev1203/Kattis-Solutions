import math
testcase = int(input())
def closest_square(number):
    while True:
        if (math.sqrt(number)-int(math.sqrt(number))):
            number = number + 1
        else:
            return number
def adjust_length(message, length):
    while len(message) != length:
        message.append("*")

def to_matrix(l, n):
    return [l[i:i+n] for i in range(0, len(l), n)]
def print_matrix(matrix,length):
    for i in range(0,length):
        for j in range(length-1, -1 ,-1):
            if matrix[j][i] != "*":
                print(matrix[j][i], end = "")
if __name__ == "__main__":
    for val in range(0,testcase):
        message = input()
        length = closest_square(len(message))
        message = list(message)
        adjust_length(message, length)
        matrix = to_matrix(message, int(math.sqrt(length)))
        length = int(math.sqrt(length))
        print_matrix(matrix,length)
        print()