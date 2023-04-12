ad0 = input("Please enter an adjective >> ")
ad1 = input("PLease enter another adjective >> ")
noun0 = input("Please enter a noun >> ")
verb = input("Please enter a verb >> ") 
adj2 = input("Please enter an adjective >> ")
noun1 = input("Please enter a noun >> ")
name = input("Please enter a name >> ")

name = name.title()

print("The {} {} {} {} over the {} {}.".format(ad0, ad1, noun0, verb, adj2, noun1))
print("I {} {}, but I didn't {} the {}.".format(verb, name, verb, noun1))
