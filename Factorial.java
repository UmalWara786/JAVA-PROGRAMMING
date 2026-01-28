import java.math.BigInteger;
import java.util.Scanner;
public class Factorial {
  
// Recursion Approach 
// Print Factorial
public static BigInteger Factorial(int n){
    //Base Condition
    if(n>=0){
    if(n==1 || n==0){
        return BigInteger.ONE;
    }
      
  BigInteger num = Factorial(n-1);
  BigInteger fac = num.multiply(BigInteger.valueOf(n));
  return fac;
     }
  else{
    System.out.println("Please! Enter positive numbers");
    System.out.println("The factorial of negative values is not possible");}
    return BigInteger.valueOf(Long.MAX_VALUE);
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number : ");
int n = sc.nextInt();

// Factorial() Function call
 BigInteger Ans = Factorial(n);
 System.out.print(n + "! = " + Ans);
 if (n < 0) {
    System.out.println("... ");
    System.out.println("It is considered as infinite");
}
  sc.close();
  }
}

  
  
