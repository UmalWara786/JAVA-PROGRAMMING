//Gangster class
 class Gangster{
 //Properties
 String run;
 String hit;
 String fire;
   
//Constructor
  Gangster(){
  System.out.println("Hi! I am Gangster class constructor");
  this.run = "I can run fast";
  this.hit = "I can hit boldly";
  this.fire = "I can fire fearlessly";
 }
   
 //Methods
 public void Running(){
 System.out.println("I am Gangster and I can run");
 }
 public void Hitting(){
 System.out.println("I am Gangster and I can hit my enemies ");
 }
 public void Firing(){
 System.out.println("I am Gangster and I can Fire the disloyal people of my gang");
 }
}

//Main class
public class OOP_Gangster {
public static void main(String[] args){
//Gangster class
Gangster g1 = new Gangster();
System.out.println("\"My Qualities\"");
  
System.out.println(g1.run);
System.out.println(g1.hit);
System.out.println(g1.fire);
System.out.println();
  
System.out.println("\"My Abilities\"");
g1.Running();
g1.Hitting();
g1.Firing();
}
}
