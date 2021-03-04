class base:
    def __init__(self,name,age):
        self.name=name
        self.age=age
    def display(self):
        print("Name: "+self.name+"Age: "+str(self.age))
# Below class is following inheritance taking some properties from parent class.
class sub(base):
     def __init__(self,name,age,gender):
         base.__init__(self,name,age)
         self.gender=gender
     def displaysub(self):
         print("Name: "+self.name+" Age: "+str(self.age)+" Gender: "+self.gender)

class subor(sub):
     def __init__(self,name,age,gender,guardian):
         #base.__init__(self,name,age)
         sub.__init__(self,name,age,gender)
         self.guardian=guardian
     def displaysubor(self):
         print("Your Name: "+self.name+" Age: "+str(self.age)+" Gender: "+self.gender+" Guardian: "+self.guardian)


name=str(input("Enter name"))
age=int(input("Enter age"))
gender=str(input("Enter gender: "))
guardian=str(input("Enter Guardian Name: "))

object=base(name,age)
object.display()

object=sub(name,age,gender)
object.displaysub()

object=subor(name,age,gender,guardian)
object.displaysubor()
