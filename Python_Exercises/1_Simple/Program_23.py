"""
Write a program get name of week and show "Holiday" if user input Sunday
"""

DAY = input("What day is today?\n>>")

if DAY == "Sunday":
    print("Holiday")
else:
    print("It's not Holiday")