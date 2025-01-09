# def sometable(vi,number):
#    if()

def table(n,value = 1):
    if(value <= 10):
        print(n ," * " , value , " = " ,n * value)
        table(n,value+1)

def showTable(l,u):
   if(l<=u):
      table(l)
      showTable(l+1,u)

n = 4
table(n)

# vi / value == 10
#  value + 1



