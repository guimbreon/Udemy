"""
write a python program to check a year, whether it is leap year or not
if it is divisible by 4
"""

YEAR = int(input("What year is it?\n>>"))

if YEAR%4 == 0:
    print("leap")
else:
    print("not leap")