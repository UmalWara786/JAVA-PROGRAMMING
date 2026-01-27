import java.util.Scanner;
public class Circumference {
  
//Circumference of a circle
//Userdefined Function  
public static float Circumference(float r){
    float pi=3.14f;
    float circum = 2*pi*r;
    System.out.println("Circumference : "+circum);
    return circum;
} 

//Main Method
public static void main(String[] args){
Scanner sc = new Scanner(System.in); 
  
System.out.print("Enter radius : ");
float radius = sc.nextFloat();
  
//Radius Function call
Circumference(radius);
sc.close();
}
}
