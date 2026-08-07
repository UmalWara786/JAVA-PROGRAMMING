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
public class OOP_Employee {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  
//Employee class objects
Employee ep1 = new Employee();
  
System.out.print("Enter your name : ");
String name = sc.nextLine();
ep1.setName(name);
  
System.out.print("Enter your salary : ");
float salary = sc.nextFloat();
ep1.Set_getSalary(salary);
  
System.out.println("Employee name : "+ep1.name);
System.out.println(ep1.name+"! here is your salary --> "+ep1.Salary);
sc.close();
}
}
