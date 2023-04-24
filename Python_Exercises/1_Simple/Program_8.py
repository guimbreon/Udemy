"""
Write a Python Program to calculate difference of two set
(the ones that aren in both are deleted)
A ={1,12,2,6,7,8} 
B={15,0,1,3,6}
"""


A ={1,12,2,6,7,8} 
B={15,0,1,3,6}

NOT_BOTH = []
for item in B:
    if item in A:
        continue
    else:
        NOT_BOTH.append(item)

print(NOT_BOTH)
