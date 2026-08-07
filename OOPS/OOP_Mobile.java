//Cellphone class
class Cell_Phone{
public
String Brand;
  
//Constructor
Cell_Phone(){
    System.out.println("Hi! I am Cell phone-class constructor");
}
  
//Methods
public void Call(){
    System.out.println("Phone is ringing");
}
public void Sound(){
    System.out.println("Phone is vibrating");
}
}

//Main class
public class OOP_Mobile {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  
//Cell Phone class objects
Cell_Phone cp1 = new Cell_Phone();
String Brand = cp1.Brand = "Samsung";
System.out.println("Mobile brand : " +Brand );
  
cp1.Call();
cp1.Sound();
}
}
