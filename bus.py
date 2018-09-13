import sys
def number_of_passenger(stops):
        print((2*(stops+1))-1)
testcase_number = int(input())
number_of_passenger(3)
for num in range (0,testcase_number):
    number_of_passenger(int(input()))