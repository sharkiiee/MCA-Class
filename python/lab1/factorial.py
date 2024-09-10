# Enter the number and find the factorial of it

N = int(input("Enter the value : "))
sum = 1
i = 1
while(i <= N):
    sum = sum * i
    i= i + 1

print(sum)