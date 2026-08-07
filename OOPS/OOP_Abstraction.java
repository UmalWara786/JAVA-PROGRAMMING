import java.util.Scanner;
// Abstraction
//Base class
abstract class Animal{
String genes;
//Constructor
Animal(){
    System.out.println("Hi! I am Animal class constructor");
}
//Abstract method
abstract public void walk();
//NonAbstract method
public void eat(){
    System.out.println("Eat grass");
}
}

//Derived classes
class Elephant extends Animal{
//Constructor
Elephant(){
    System.out.println("Hi! I am Elephant class constructor");
}
public void walk(){
    System.out.println("Walk on 4 legs");
}
public void eat(){
    System.out.println("Eat tiny creatures");
}
}

class Chicken extends Animal{
String Looks = "Bird";
//Constructor
Chicken(){
    System.out.println("Hi! I am Chicken class constructor");
}
public void walk(){
    System.out.println("Walk on 2 legs");
}
}

//Main class
public class OOP_Abstraction {
public static void main(String[] args){
  
//Elephant class
Elephant e1 = new Elephant();
e1.walk();
String Genes = e1.genes = "Strong";
System.out.println(Genes);
e1.eat();
  
//Chicken class
Chicken c1 = new Chicken();
c1.walk();
String Physical = c1.genes = c1.Looks;
System.out.println("Looks of hen : "+Physical);
System.out.println(c1.genes);
}
}
