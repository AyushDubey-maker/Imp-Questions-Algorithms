import random

randNumber=random.randint(1,100)

print(randNumber) // This print is just for testing purpose.This has to be hidden.
userInput=None
guesses=0

while(userInput!=randNumber):
    userInput=int(input("Guess a number: "))

    if userInput<randNumber:
        print("Choose a higher value number.")
        guesses+=1
    elif userInput>randNumber:
        print("Choose a lower value number.")
        guesses+=1
    else:
        print("You guessed the number correctly.")
        guesses+=1
    if guesses==5:
        print("You failed..Sorry")
        break
    
if(guesses<5):    
    print("You took",guesses," Guess" )
    
    ---------------------------------X---------------------------X-------------------------------X----------------------
    Output:
Guess a number: 44
Choose a higher value number.
Guess a number: 90
Choose a higher value number.
Guess a number: 92
Choose a higher value number.
Guess a number: 93
You guessed the number correctly.
You took 4  Guess
