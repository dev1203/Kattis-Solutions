import sys
from decimal import Decimal
def fact(num):
	factorial=1
	for i in range(1,num+1):
		factorial=factorial*i
	return factorial
def anagramcheck(my_set,list):
	ans=1
	for i in my_set:
		ans*=fact(list.count(i))
	return ans
def main():
	contents = []
	while True:
	    try:
	        line = input()
	    except EOFError:
	        break
	    contents.append(line)
	my_set=set()
	for i in contents:
		for j in i:
			my_set.add(j)
		a=fact(len(i))
		b=anagramcheck(my_set,i)
		print(str(Decimal(a) / Decimal(b)))







if __name__=="__main__":
	main()



