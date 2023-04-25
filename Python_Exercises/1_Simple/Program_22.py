"""
write a program to check if a character is whether vowel or consoant
"""

CHARAC = input("What character do you want to analyze?\n>>")

VOWEL =["a","e","i","o","u"]
if CHARAC.lower() in VOWEL:
    print("Is vowel")
elif CHARAC.isnumeric():
    print("Is number")
else:
    print("Is consoant")