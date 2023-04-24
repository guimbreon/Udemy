"""
Write a Python program to get 6 subject marks from the user and calculate total and average of
that marks. And display to user.
"""
GRADE = 0

for i in range(7):
    if i>=1:
        GRADE += int(input(f"Which was your grade numver {i}?\n>>"))
GRADE = GRADE/6
print(f"Your average is: {GRADE}")