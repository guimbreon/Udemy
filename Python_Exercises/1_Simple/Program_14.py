"""
write a program to get 6 numver in the list and sum that number
"""
total = 0
for i in range(7):
    if i>=1:
        total += int(input(f"Give-me the number ({i}): "))
print(total)