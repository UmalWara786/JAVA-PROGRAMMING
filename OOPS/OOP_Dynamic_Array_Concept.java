import java.util.Scanner;

//Employee class
class Employee{
//Properties
  String name;
  Float Salary;

//Constructor
  Employee(){
  System.out.println("Hi! I am Employee class constructor");
  }

 //Methods
  public void setName(String n){
  this.name = n;
    }
  public String getName(){
  return name;
    }
  
  public void setSalary(float s){
  this.Salary = s;
    }
  public float Set_getSalary(float s){
  this.Salary = s;
  return Salary;
    }
}

//Main class
public class OOP_Dynamic_Array_Concept {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  
//Employee class objects
Employee ep1 = new Employee();
Employee ep2 = new Employee();
Employee ep3 = new Employee();
Employee ep4 = new Employee();
Employee ep5 = new Employee();

//Array concept
Employee[] employee = {ep1,ep2,ep3,ep4,ep5};

 //For taking user input
 for(int i=0; i<5; i++){
 System.out.println("* Employee "+(i+1)+" Information");
 System.out.print("  Enter your name : ");
 String name = sc.nextLine();
 employee[i].setName(name);
   
 System.out.print("  Enter your salary : ");
 float salary = sc.nextFloat();
 employee[i].Set_getSalary(salary);
 //To clear buffer  
 sc.nextLine();
 }
 System.out.println();

//Print Information
for (int i=0; i<5; i++){
System.out.println("->Employee "+(i+1)+" Information");
System.out.println("  Employee name : "+employee[i].name);
System.out.println("  "+employee[i].name+"! here is your salary --> "+employee[i].Salary);
}
sc.close();
}
}
