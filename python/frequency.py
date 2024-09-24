# write a program to find the frequency of the data.


nationality = input("if you are indian type indian in small letters: ")

if(nationality == "indian"):
    age = int(input("enter your age : "))
    if(age >= 18):
        print("Eligible to vote")
    else:
        print("Not eligible to vote")
else:
    print("Not eligible to vote")