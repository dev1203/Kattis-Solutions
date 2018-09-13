import decimal
area = input()
num = (decimal.Decimal(int(area)).sqrt()) * 4
print('{:0.20f}'.format(num))