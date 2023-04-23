"""
Write a program to show such type of layout of number and square.
Input: 5
Expected Result:
Number:     Square:
1           1
2           4
3           9
4           16
5           25
"""

number = int(input("Until which number?\n>>"))
i = 1

while(number != i-1):
    print(f"{i}     {i*i}")
    i+=1
