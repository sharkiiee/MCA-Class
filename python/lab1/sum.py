# Enter the value and find the sum of all the digits of that number

N = int(input("Enter the value"))
save = N
sum = 0

while(save != 0):
    rem = save % 10
    sum = sum + rem
    save = save // 10
print(sum)
