#Adding a placeholder
"""
number = 26
newmsg = "The number is {} for you!"
print(newmsg.format(number))  # .format puts what's inside it in the {} from the string
"""
#Displayed as a number with two decimals
"""
number = 26.126123
newmsg = "The number is {:.2f} for you!"
print(newmsg.format(number)) #it'll transform your number into a 2 decimal digit number
"""
#Adding Multiple Placeholders
"""
quantity = 5
itemNumber = 60
price = 24

firstOrder =  "We want {} pieces of item number {} for {:.2f} dollars"
print(firstOrder.format(quantity,itemNumber,price)) #here it formats all the variables in the order u place them
"""
#Using index numbers for placeholders
"""
age = 1613
name = "Irony"
newTxt = "The name is {1}. {1} is {0} years old."#we set previously where the variables are placed
print(newTxt.format(age,name))#here we place inside the .format module the organization we want
"""
#Using named indexes

newTxt = "The name is {name}. {name} is {age} years old."#here we place the names of the indexes
print(newTxt.format(age = 1224,name = "Hironi"))#here we place inside the .format module the indexes and their value

