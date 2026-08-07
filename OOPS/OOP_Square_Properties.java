import java.util.Scanner;

//Square class
class Square{
private float sides_length;
private float Area;
private float Perimeter;
  
//Constructor
Square(){
    System.out.println("Hi! I am square class constructor");
}
  
//Methods
public float Area(float length){
    this.sides_length = length;
    float Calculation = length*length;
    this.Area = Calculation;
    return this.Area;
}
public void Print_Area(){
    System.out.println("Area : "+this.Area);
}
  
public float Square_Perimeter(){
    float Calculator = (this.sides_length + this.sides_length + this.sides_length + this.sides_length);
    this.Perimeter = Calculator;
    return this.Perimeter;
}
public void Print_Perimeter(){
    System.out.println("Perimeter : "+this.Perimeter);
}
}

//Main class
public class OOP_Square_Properties {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

//Square class
 Square s1 = new Square();
 System.out.print("Enter side length of the square : ");
  
 try {
 float length = sc.nextFloat();
  if((length % 1 == 0 ) || (length % 1 != 0)){
   s1.Area(length);
   s1.Print_Area();
   s1.Square_Perimeter();
   s1.Print_Perimeter();
     }
 } catch (RuntimeException e) {
   System.out.println("Please! Enter valid value ");
 }
  
sc.close();  
}
}
