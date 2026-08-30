import random
lno=random.randint(1,50)
print("Welcome to the Guessing Game!")
n=int(input("Guess a number between 1 and 50: "))

while n>=1 and n<=50:
   if n==lno:
       print("Wohooo!!!You guessed it right")
       break
   elif n<lno:
       print("Your guess is too low. Try again.")
       n=int(input("Guess a number between 1 and 50: "))
   elif n>lno:
       print("Your guess is too high. Try again.")
       n=int(input("Guess a number between 1 and 50: "))
   
    
if n<1 or n>50:
   print("Your guess was out of range. Sorry!!")     

