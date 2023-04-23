"""
Write a python program to take age from the user to check whether
user able to participate in voting or not. 
If age is less than 18 then it dont allow to participate.
And show, after that, when they will be able to participate.

"""

age = int(input("How old are you?\n>>"))

if age>=18:
    print("Congrats you can participate in voting!")
else:
    print("U can't participate in voting!")
