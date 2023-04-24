"""
Write a python program to calculate union of two set
A = {3,2,4,5,6,7,8} B = {4,12,5,1,6,8}
"""
A = {3,2,4,5,6,7,8}
B = {4,12,5,1,6,8}

C = []
for item in A:
    C.append(item)
for item in B:
    if item in C:
        print(f"{item} is already in the SET")
    else:
        C.append(item)
print(C)
