def fibonacci(number):
    """to get fibonacci sequence"""
    num1 = 1
    num2 = 1
    num3 = 0
    all_numbers = [1,]
    for i in range(number):
        num3 = num1 + num2
        all_numbers.append(num2)
        num1=num2
        num2=num3
    return all_numbers


try:
    th = int(input("How many numbers are there on your sequence?\n>>> "))
except:
    print("\n\nThe character you entered is not a number!")
    quit()

seq = fibonacci(th-1)
print(f"\n\n{seq}")
