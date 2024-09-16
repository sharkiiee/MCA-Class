# append will only include only  one element
# extend will take all the elements and merge them

l1 = [10,20,30,40]

l2 = l1[::] 
l3 = ["Hello ",4.6,45]
l1.extend(l3)
print(l1)


l2.append(l3)
print(l2)
print(l2[4])