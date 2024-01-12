from random import randrange
a=int(input("enter your 4 digit password: "))
while (True):
    b=randrange(0,10000)
    print(b," enter")
    if a==b:
        break
    else:
        continue