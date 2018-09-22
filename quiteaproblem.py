import sys
import re
for input in sys.stdin:
    if "PROBLEM" in input.upper():
        print('yes')
    else:
        print("no")