import sys
line = input().split()
kings = int(line[0])
queens = int(line[1])
rooks = int(line[2])
bishops = int(line[3])
knights = int(line[4])
pawns = int(line[5])
if kings == 0:
    print(1)
else:
    print(1-kings)
if queens == 0:
    print(1)
else:
    print(1-queens)
if rooks == 2:
    print(0)
else:
    print(2-rooks)
if bishops == 2:
    print(0)
else:
    print(2-bishops)
if knights == 2:
    print(0)
else:
    print(2-knights)
if pawns == 8:
    print(0)
else:
    print(8-pawns)

