import java.util.Scanner;
public class Power_Calculation {
  
//Power Function
//Userdefined Function  
public static int power(int x,int n){
  int result=1;
  for(int i=1; i<=n; i++){
    result=result*x;
    }
  System.out.print("x^n = ");
  return result;
}

//Main Method
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  
System.out.print("Enter x : ");
int x = sc.nextInt();
System.out.print("Enter n : ");
int n = sc.nextInt();
  
//Power Function call
System.out.println(power(x,n));
sc.close();
}
}
