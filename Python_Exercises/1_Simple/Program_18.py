"""
write a python program to store name, adress, contact in a DICTIONARY,
and then update their contact(ask again or smt)
"""
Dictionary = {}
NAME = input("What's your name?\n>>")

ADRESS = input("\nWhat's your adress?\n>>")

Dictionary[NAME] = ADRESS, input("\nWhat's your contact?\n>>")

print("\n\n")

print(Dictionary)

print("\n\n")

Dictionary[NAME]= ADRESS,input("\nAre you are that is your contact?\n(Repeat it if it is)\n>>")

print("\n\n")

print(Dictionary)

print("\n\n")
