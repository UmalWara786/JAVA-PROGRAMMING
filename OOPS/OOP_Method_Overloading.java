//Polymorphism
// Compile Time Polymorphism

class Candidate {
String name;
int age;

//Overloaded Methods
  public void Print_Info(String name){
  System.out.println(name);
    }
  
  public void Print_Info(int age){
  System.out.println(age);
    }
  
  public void Print_Info(String name, int age){
  System.out.println(name);
  System.out.println(age);
    }
  
 //Constructor
  Candidate(){
  System.out.println("Hi! I am constructor");
    }
}

//Main class
public class OOP_Method_Overloading {
public static void main(String[] args){
  
//Function overloading
 Candidate s1 = new Candidate();
 s1.Print_Info("king",90);
 s1.Print_Info("Umal");
 s1.Print_Info(13);

}
}
