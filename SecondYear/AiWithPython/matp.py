import matplotlib.pyplot as plt;

x=[1,2,3,4,5]
y=[5,10,15,20,25]
x1=[3,6,9,12,15]
y1=[2,4,6,8,10]
plt.plot(x,y1,marker="p")
plt.plot(x,y,marker=".")
plt.plot(x1,y1,marker=".")
plt.xlabel("x-axis")
plt.ylabel("y-axis")
plt.title("simple graph")
plt.show()