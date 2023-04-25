"""
Write a program to get 2 numvers and operator from the user to
perform arithmetic operation
"""

NUMBER1 = int(input("What number do you want to analyze?\n>>"))

NUMBER2 = int(input("What's the second number do you want to analyze?\n>>"))

OPERATOR = input("What operator do you want to use?\n>>")

if OPERATOR == "-":
    print(NUMBER1-NUMBER2)
elif OPERATOR == "+":
    print(NUMBER1+NUMBER2)
elif OPERATOR == "/":
    print(NUMBER1/NUMBER2)
elif OPERATOR == "*":
    print(NUMBER1*NUMBER2)
else:
    print("That is not a available operator")