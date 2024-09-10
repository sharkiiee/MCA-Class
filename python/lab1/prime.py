N = int(input("Enter the value"))
i = 2
while(i < N):
    if(N % i == 0):
        print("Not a prime number")
        break
    i = i + 1
else:
    print("is prime nuimber")    

    
