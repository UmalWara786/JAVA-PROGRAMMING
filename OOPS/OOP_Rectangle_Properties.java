//This class implements a Rectangle with methods to calculate area and perimeter, along with user input handling.

import java.util.Scanner;

//Rectangle class
class Rectangle {
//Data  
private float length;
private float width;
private float Area;
private float Perimeter;
  
//Constructor
Rectangle(float l, float w) {
  System.out.println("Hello! I am Rectangle class constructor");
  System.out.println();
  System.out.println("\"Rectangle Information\"  ");
  this.length = l;
  this.width = w;
}
  
//Methods
public float Rectangle_Area() {
  double Rec_Area = this.length * this.width;
  //Variable Declaration
  float Original_Area;
  //Variable Initialization
  Original_Area = this.Area = (float) Rec_Area;
  return Original_Area;
}
public void Print_Rect_Area() {
    System.out.println("Rectangle's Area : " + this.Area);
}
  
public float Cal_Rec_Perimeter() {
    float Peri = (this.length + this.length + this.width + this.width);
    this.Perimeter = Peri;
    return this.Perimeter;
}
public void Print_Rec_Perimeter() {
    System.out.println("Rectangle's Perimeter : " + this.Perimeter);
    System.out.println();
}
}

//Main class
public class OOP_Rectangle_Properties{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

//Rectangle class
System.out.println("\"Rectangle 1 Information\"");
  
//With Exception condition
try {
System.out.print("Enter length : ");
float l = sc.nextFloat();
  
//Checking condition
if((l % 1 == 0) || (l % 1 != 0)){
System.out.print("Enter width : ");
float w = sc.nextFloat();
  
//Nested if (Inner condition)
if((w % 1 == 0) || (w % 1 != 0)){
Rectangle r1 = new Rectangle(l,w);
  
r1.Rectangle_Area();
r1.Print_Rect_Area();
r1.Cal_Rec_Perimeter();
r1.Print_Rec_Perimeter();
        }
    }
} catch (RuntimeException e) {
  System.out.println("Please! Enter valid values");
}

//Another object of Rectangle class
System.out.println("\"Rectangle 2 Information\"");
  
//Without Exception condition
System.out.print("Enter length : ");
float l = sc.nextFloat();
  
System.out.print("Enter width : ");
float w = sc.nextFloat();
  
Rectangle r2 = new Rectangle(l,w);
  
r2.Rectangle_Area();
r2.Print_Rect_Area();
r2.Cal_Rec_Perimeter();
r2.Print_Rec_Perimeter();  
  
sc.close();
}
}
