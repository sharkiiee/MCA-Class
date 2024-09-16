# write a program to create a list of only those numbers that are divisible by 3 from another list given as below.

# l = [10, 30, 45, 55, 60, 80]

l = [10, 30, 45, 55, 60, 80]

s = []
for i in l:
    if(i%3 ==0):
        s.append(i)

print(s)
