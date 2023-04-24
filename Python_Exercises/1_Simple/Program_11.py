"""
Write a program to get 2 numbers from the user and Dysplay maximum number
"""
number1 = int(input("Give-me the first number:\n>>"))
number2 = int(input("Give-me the second number:\n>>"))

if number1 > number2:
    print(f"The first number({number1}) is bigger than the second({number2})")
if number1 < number2:
    print(f"The second({number2})is bigger than the first number({number1}) ")
if number1 == number2:
    print(f"The first number({number1}) and the second({number2}) are the same")