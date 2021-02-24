import string
import random
# Through below code we can import all lower/upper ascii letters 
if __name__=='__main__':
    s1=string.ascii_lowercase
   
    s2=string.ascii_uppercase
    
    s3=string.digits # all digits from 0-9
   
    s4=string.punctuation
    # This code block checks that the user inserts only integer as Password Length.
    while True:
        try:
            passLen = int(input("Enter the password length: \n"))
            break
        except ValueError :
            print("Oops! That's not the valid number. Please try again...")
   
    s=[]
    
    s.extend(list(s1))  # difference btw extend and append.
    s.extend(list(s2))
    s.extend(list(s3))
    s.extend(list(s4))
   
    random.shuffle(s)
    print("Your password is: ")
    print("".join(random.sample(s,passLen)))
    
    ----------------------------------------------------------------
    Output:
    Enter the password length:
     3
   Your password is:
     IM,
    
