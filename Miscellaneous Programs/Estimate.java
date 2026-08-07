import java.util.Scanner;

public class Estimate {
//Estimate greater number
// Userdefined Function
public static void greater(int a, int b){
    if(a>b)
        System.out.println("(1st) greater number :" +a);
    else
        System.out.println("(2nd) greater number :" +b);
}

//Main Method
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a,b;
System.out.print("Enter first number : ");
a=sc.nextInt();
System.out.print("Enter second number : ");
b=sc.nextInt();
  
//Greater Function call
greater(a,b);
sc.close();  
}
}
