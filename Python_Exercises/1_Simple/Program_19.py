"""
write a program to get 3 numbers from the user and put in the follwoing eaquation:
a+b+ca/(b(2a+3b))
"""

A = int(input("give-me a number:\n>>"))

B = int(input("give-me a number:\n>>"))

C = int(input("give-me a number:\n>>"))

equation = A+B+C*A/(B*(2*A+3*B))

print(equation)