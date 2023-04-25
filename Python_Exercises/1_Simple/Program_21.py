"""
Write a program to get 5 numbers from user in array, find the maximum number
"""

ARRAY = []

for i in range(5):
    ARRAY.append(int(input("\nGive-me one number:\n(only postive numbers)\n>>")))

TEST = -13

for number in ARRAY:
   if number > TEST:
       TEST = number
       
print(TEST)
