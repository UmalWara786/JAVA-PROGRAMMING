import java.util.Scanner;

public class Average {
//Calculate Average
//Userdefined Function
  public static float Average(float a,float b,float c){
      float Av=(a+b+c)/3;
      System.out.print("Average : ");
      System.out.println(Av);
      return Av;
    }

//Main Method
public static void main(String[] args){  
  
Scanner sc = new Scanner(System.in);
float a,b,c;
System.out.print("Enter first number : ");
a=sc.nextFloat();
System.out.print("Enter second number : ");
b=sc.nextFloat();
System.out.print("Enter third number : ");
c=sc.nextFloat();
  
// Average Function call
Average(a,b,c);
sc.close();
}
}
  
