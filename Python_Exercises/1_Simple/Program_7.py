"""
Write a python program to calculate intersection of two sets
(only the numbers that are in both sets)
A ={5,2,4,6,7,1}
B={5,3,11}
"""

A ={5,2,4,6,7,1}
B={5,3,11}
BOTH = []
for item in B:
    if item in A:
        BOTH.append(item)
print(BOTH)