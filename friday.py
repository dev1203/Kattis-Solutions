testcase = int(input())
def make_year_array(year, days_in_year):
    for val in range(0, days_in_year, +7):
        year[val] = 'sunday'
for val in range(0,testcase):
    line = input()
    days_in_year = int(line.split()[0])
    number_of_month = int(line.split()[1])
    months = input().split()
    year = [val for val in range(1,days_in_year+1)]
    make_year_array(year,days_in_year)
    sum_of_days = 0
    count = 0
    for val in months:
        if int(val) >= 13 and year[sum_of_days] == 'sunday':
            count = count + 1
        sum_of_days = sum_of_days + int(val)
    print(count)