"""
Write a program to get 5 numbers from the user in  a array and sum all numbers and display
"""
ARRAY = []

for i in range(5):
    ARRAY.append(int(input("Give-me a number:\n>>")))

SUM = 0

for number in ARRAY:
    SUM+=number
print(SUM)

print("\n")

print(ARRAY)
