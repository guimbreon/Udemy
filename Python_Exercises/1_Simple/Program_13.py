"""
write a program to get password from user and make sure that password
contains number and alphabetic
"""
PASSWORD = input("What password do you want to analyze?\n>>")

if(PASSWORD.isalnum()):
    print("Your password is okay")
else:
    print("You should change your password")