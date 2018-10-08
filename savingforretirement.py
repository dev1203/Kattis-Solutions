data = input().strip().split()
bob_age = int(data[0])
bob_retire_age = int(data[1])
bob_savings = int(data[2])
alice_age = int(data[3])
alice_savings = int(data[4])
bob_total = (bob_retire_age - bob_age) * bob_savings
alice_total = 0
while True:
    if alice_total <= bob_total:
        alice_age = alice_age + 1
        alice_total = alice_total + alice_savings
    else:
        break
print(alice_age)