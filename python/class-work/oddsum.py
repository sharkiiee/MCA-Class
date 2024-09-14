# sum  to display sum of odd values of the series.

values = input("enter the series")

finalValue = values.split(' ')
sum = 0
for N in finalValue:
    if(int(N)%2!=0):
        sum = sum + int(N)

print(sum)