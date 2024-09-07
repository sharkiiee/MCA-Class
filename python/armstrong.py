# Enter the number and check if the number is armstrong or not

N = int(input("Enter the value : "))
save = N
count = 0

while(save != 0):
     save = save // 10
     count = count + 1

save = N
sum = 0
while(save != 0):
     rem = save % 10
     sum = sum + rem ** count
     save = save // 10
    
if(N == sum):
     print("Armstrong Number")
else:
     print("Not Armstrong")