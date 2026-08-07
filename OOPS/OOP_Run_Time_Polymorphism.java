//Run Time Polymorphism

//Animal class
class Animal{
  
//Constructor
 Animal(){
 System.out.println("Hello! I am Parent class Constructor");
  }

 //Method 
 public void Say_Hello(){
 System.out.println("Hi!");
    }
}

//Dog class
//Inherited Class
class Dog extends Animal{
//Constructor
  Dog(){
  System.out.println("Hello! I am child class Constructor");
    }

 //Methods 
 public void Say_Hello(){
 System.out.println("Woof");
    }
 public void Eat(){
 System.out.println("Chew Chew");
    }
}

//Cat class
class Cat extends Animal{
  
//Constructor
  Cat(){
  System.out.println("Hello! I am Cat class Constructor");
    }
  
//Method
  public void Say_Hello(){
  System.out.println("Meow Meow");
    }
}

//Main class
public class OOP_Run_Time_Polymorphism {
public static void main(String[] args){
Animal a1 = new Animal();
a1.Say_Hello();

Dog d1 = new Dog();
d1.Say_Hello();
d1.Eat();

Cat c1 = new Cat();
c1.Say_Hello();

Animal a2 = new Dog();  //Upcasting
a2.Say_Hello();

Animal a3 = new Cat();
a3.Say_Hello();

Dog d2 = (Dog) a2;    //Down casting
System.out.println(d2);
    }
}
