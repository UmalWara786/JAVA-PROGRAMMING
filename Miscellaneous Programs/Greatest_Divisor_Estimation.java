import java.util.Scanner;

public class Greatest_Divisor_Estimation {
  
//Greatest common divisor Function
//Userdefined Function  
public static int divisor(int a,int b){
 while(b!=0){
  int reminder=a%b;
  a=b;
  b=reminder;
 }
System.out.print("GCD = ");
return a;
  }

//Main Method
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.print("Enter num1 : ");
int num1 = sc.nextInt();
System.out.print("Enter num2 : ");
int num2 = sc.nextInt();
  
//Divisor Function call
System.out.println(divisor(num1,num2));
sc.close();
}
}
