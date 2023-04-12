#import the regular expressions module
import re
#Search the string to see if match or no match
newTxt = "You can start learning Python"

x = re.search("^You.*Python$",newTxt)
"""
we use ^ to say that it start with the word that is next to ^
(THESE SEPARATED BY A DOT".")
and * to say that the word followed by that, is the last word
then we have ",newTxt" we then say which variable we are searching
"""
if x:
    print("WE HAVE A MATCH!")
else:
    print("NO MATCH!")


print("\n\nSEPARATOR\n\n")
#regex function, metacharacters,special sequences and sets
newTxt = "Python is very very easy to understand"
y = re.findall("very", newTxt)

print(y)

print("\n\nSEPARATOR\n\n")
#findall list of matches

y = re.search("very",newTxt)
print("\n\nSEPARATOR\n\n")
#Search for the first white-space
 
# use search to search 
print("The fist word 'very' is:", y.start()) # .start searches the FIRST

print("\n\nSEPARATOR\n\n")
#Making a search that returns no match
"""
it says None
"""
print("\n\nSEPARATOR\n\n")
#Split at each white-space inthe string

newTxt = "Python is very very easy to understand"
#first option
x = newTxt.split(" ")
print(x)
#second option
y = re.split(" ", newTxt)
print(y)
print("\n\nSEPARATOR\n\n")
#Control the number of occurrences
"""
while using the second option:
"""
number = 2 #number of times it will divide and then the rest will stay together


newTxt = "Python is very very easy to understand"
y = re.split(" ", newTxt, number)
print(y)

print("\n\nSEPARATOR\n\n")
#replace every white space and count parameter

print("\n\nSEPARATOR\n\n")
#search and return a match object

print("\n\nSEPARATOR\n\n")
#span and Searching for upper case

newTxt = "Code with Python now"
x = re.search(r"\bC\w+",newTxt)
#r is to say we get it to find in a r string

print(x.span()) #.span is to get all the cords from the word we find


print("\n\nSEPARATOR\n\n")
#string property to return the string passed into the function

print("\n\nSEPARATOR\n\n")
#Print the word that contains upper case

print("\n\nSEPARATOR\n\n")