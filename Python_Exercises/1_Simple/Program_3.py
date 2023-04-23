"""
Write a program to get name and age from the user and display name and
age on the screen in the format:

Expected result if name is "Batata Frita" and afe is 13:

Hi Batata Frita! Your age is 13.
"""

name = input("What's your name?\n>>")

age = int(input("What's your age?\n>>"))

print(f"Hi {name}! Your age is {age}!")
