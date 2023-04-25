with open(f"/home/guimbreon/Desktop/Git_organazier/Udemy/Python_Exercises/1_Simple/README.MD","w") as file:
    for i in range(101):
        if i>=1:
            file.write(f"\nProgram_{i}:\n")
