# Enter the value and then reverse that number

N = int(input("Enter the value : "))
save = N
value = 0

while(save != 0):
    rem = save % 10
    value = value * 10 + rem
    save = save // 10

print(value)