import sys
def calculate_time(start_time, end_time):
    # print(start_time, end_time)
    print((end_time * 60 - start_time * 60) % 60)
for line in sys.stdin:
    day = line.strip().split(" ")
    calculate_time(float(day[3].replace(":",".")),float(day[4].replace(":",".")))