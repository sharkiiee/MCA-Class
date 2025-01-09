# Write a recursive function in which we pass a value and it will check and display that passed value is prime or not prime

def isPrime(num,value = 2):
    if value < num:
        if num % value == 0:
            print("it's not a prime")
        else:
            return isPrime(num,value + 1)
    else:
        print("It's a prime number")

isPrime(19)
