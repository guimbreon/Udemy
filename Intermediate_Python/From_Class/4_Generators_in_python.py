# simple generator function with yield
def Items():
    print("First item!")
    yield 15

    print("Second")
    yield 25

    print("Last!")
    yield 40

newGenerat = Items()

print(next(newGenerat))
print(next(newGenerat))
print(next(newGenerat))

print("\n\nSEPARATOR\n\n")
#return a value and terminate the execution of the function
"""
we dont use the return statment in the previous section because it would just corrupt the 
Interation "StopInteration"
"""

print("\n\nSEPARATOR\n\n")
#Using generator function with for loop
def newUpTo(x):
    for i in range(x):
        yield i

seq1 = newUpTo(7)

print(next(seq1))
print(next(seq1))
print(next(seq1))
print(next(seq1))
print(next(seq1))
print(next(seq1))
print("\n\nSEPARATOR\n\n")
#yield square of number and 
#loop and StopIteration automatically

def squareSequence(x):
    for i in range(x):
        yield i*i

seq2 = squareSequence(7)

for item in seq2:
    print(item)

print("\n\nSEPARATOR\n\n")
#Use generator expression
newSquare = (i * i for i in range(7))
print(next(newSquare))
print(next(newSquare))
print(next(newSquare))
print(next(newSquare))
print(next(newSquare))
print(next(newSquare))
print(next(newSquare))
print("\n\nSEPARATOR\n\n")
#pass generator expression in a function
import math

print(sum(i * i for i in range(7)))