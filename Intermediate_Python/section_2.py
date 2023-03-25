#Local Scope Of a Function

def newfunc():
    x = 13
    print(x)#it'll work because it's inside a function

newfunc()
#print(x)     this will not work bcs it's trying to use a function variable outside the function

#Local variable can be accessed from a function inside function

def newOut():
    x = 200
    return x  #because we returned a value, now we can use it outside the function

number = newOut
print(number)

#Global variables are available from within any scope

x = 100 #global variable

def func():
    print(x)# u can see that global variables can be used anywhere!

func()
print(x)

#Naming and Renaming Variables

x = 100  #global value of x

def newfunc():
    x = 50 #local value of x: here the x value is set to 50, and doing so...
    print(x)
newfunc()#here it'll print the number 50
print(x)#here it'll print the number 100 bcs that's the global value of x

#The global keyword makes the variable global
x=100
print(x,"outside before")
def newfunc():
    global x #transforms the local variable x to a global variable
    x=50
    print(x,"inside")
newfunc()
print(x,"outside after")#now here it'll print 50 not 100

