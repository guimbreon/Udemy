"""
Write a python program to get number from the user, and display table(tabuada) for that number
"""

NUMBER = int(input("Which number do you want the table?\n>>"))

for i in range(11):
    if i>=1:
        print(f"{i}*{NUMBER}={i*NUMBER}")