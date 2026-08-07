//Polymorphism
// Compile Time Polymorphism

//Constructor Overloading
class User {
//Properties  
public String Username;
public String Email;
public int age;
  
//Overloaded Constructors
User() {
    System.out.println("Hi! I am non parameterized constructor");
}
  
User(String name) {
    this.Username = name;
}
  
User(String name, String email) {
    this.Username = email;
    this.Email = name;
}
  
User(String name, String email, int age) {
    this.Username = name;
    this.Email = email;
    this.age = age;
}
}

//Main class
public class OOP_Constructor_Overloading {
public static void main(String[] args){
  
//  Constructor overloading
  
//Deep concepts of passing values  
User u1 = new User();
User u2 = new User("Umal");
System.out.println(u2.Email);
  
User u3 = new User("Dalton","@gmail.com");
String name = u3.Username;
  
System.out.println("Username : "+name);
System.out.println("Email : "+u3.Email);
  
User u4 = new User("Wara","k@email.com",98);
System.out.println(u4.Username);
System.out.println(u4.Email);
System.out.println(u4.age);  
}
}
