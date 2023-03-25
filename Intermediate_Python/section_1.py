"""
Section 1: Python iterators
"""

#ITERATORS FROM FRUITSTUPLE AND PRINT EACH VALUE

print("\n")


FRUITSTUPLE = ("banana","lemon","apple")
NEWIT = iter(FRUITSTUPLE) #separates all the items in the tuple

print(next(NEWIT))#prints the first item
print(next(NEWIT))# then the second which is the "next" item
print(next(NEWIT))

#ITERATOR FROM SEQUENCE OF CHARACTERS

print("\n")

FRUITSTR = "apple"
NEWIT = iter(FRUITSTR) #turns the string into an iterable object

print(next(NEWIT))
print(next(NEWIT))
print(next(NEWIT))
print(next(NEWIT))
print(next(NEWIT))

#FOR LOOP TO ITERATE THROUGHT A TUPLE

print("\n")

FRUITSTUPLE = ("banana","lemon","apple")

for i in FRUITSTUPLE:
    print(i)


#FOR LOOP TO ITERATE THROUGH A TUPLE

print("\n")
FRUITSTR="lemon"

for i in FRUITSTR:
    print(i)

#BUILD AN ITERATOR THAT RETURNS NUMBERS

class Counting:
    """
    Counting until u want
    """
    def __iter__(self):
        self.a = 1
        return self
    def __next__(self):
        x = self.a
        self.a += 1
        return x
    
NewObj = Counting()
NewIt = iter(NewObj)

print(next(NewIt))#it'll goto the func next and count the first number which is 1
print(next(NewIt))# it'll run a second time, to the "next" number which is 2
print(next(NewIt))# and so on and so on
print(next(NewIt))
print(next(NewIt))

#RAISE StopIteration
print("\n")

class Counting:
    """
    Counting until the number 19
    """
    def __iter__(self):
        self.a = 1
        return self
    def __next__(self):
        if self.a <= 19:
            x = self.a
            self.a += 1
            return x
        else:
            raise StopIteration
        
NewObj = Counting()
NewIt = iter(NewObj)

for i in NewIt:
    print(i)