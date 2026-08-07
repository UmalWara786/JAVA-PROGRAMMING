import java.util.Scanner;

//Circle class
class circle{
//Properties  
private float radius;
private float Diameter;
private float Area;
private float circumference;
  
//Constructor
circle(float r){
  this.radius = r;
  System.out.println("Hi! I am circle class constructor");
  System.out.println("\"Circle's Information\"");
  System.out.println("Radius : "+this.radius);
}
  
//Method
public float Cir_Diameter(){
    float Dia = this.Diameter = this.radius+this.radius;
    return Dia;
}
public void Print_Diameter(){
    System.out.println("Diameter : "+this.Diameter);
}
  
public float Circle_Area(){
   final float pi = 3.14f;
   float Ans = pi*this.radius*this.radius;
   this.Area = Ans;
   return Ans;
}
public void Print_Cir_Area(){
    float Outcome = this.Area;
    System.out.println("Area of the circle : "+Outcome);
}
  
public double Calculate_Circum(){
    final float Pi = 3.14f;
    float Result = this.circumference = 2*Pi*this.radius;
    return Result;
}
protected void Print_Circum(){
    System.out.println("Circumference : "+this.circumference);
}
}

//Main class
public class OOP_Circle_Properties {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

//circle class
System.out.print("Enter radius : ");
double rad = sc.nextDouble();
  
//Explicit Casting
float Type_cast_radius = (float)rad;
circle cr1 = new circlur(Type_cast_radius);
  
cr1.Cir_Diameter();
cr1.Print_Diameter();
  
cr1.Circle_Area();
cr1.Print_Cir_Area();
  
cr1.Calculate_Circum();
cr1.Print_Circum();
  
sc.close();
}
}
