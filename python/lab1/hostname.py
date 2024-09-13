emailid = input("enter the email id : ")

hostname =( emailid.split('@')[1]).split('.')[0]

print(hostname)