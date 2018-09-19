import fractions
num_rings = int(input())
rings = input().strip().split()
first_number = int(rings.pop(0))
for val in rings:
    if first_number % int(val) !=0:
        print(fractions.Fraction(first_number, int(val)))
    else:
        print(str(int(first_number/int(val)))+'/1')