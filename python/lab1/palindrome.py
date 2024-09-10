# Input the number and check if palindrome or not

N = int(input("Enter the value : "))
save = N
value = 0

while(save != 0):
    rem = save % 10
    value = value * 10 + rem
    save = save // 10

if(value == N ):
    print("Number is palindrome")
else:
    print("Not Palindrome")