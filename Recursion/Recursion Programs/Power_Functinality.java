import java.util.Scanner;
public class Recursion {
  
// Recursion Approach
// Calculate Power --> Stack height = log n
public static int Calculate_Power(int x, int n){
  //Base Conditions
  if(n==0){
    return 1;
    }
  if(x==0){
    return 0;
    }
  
  //n is Even
  if(n%2==0){
  return   Calculate_Power(x,n/2)*Calculate_Power(x,n/2);
    }
  //n is Odd
  else {
  return Calculate_Power(x,n/2)*Calculate_Power(x,n/2)*x;
    }
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);  

System.out.print("Enter x = ");
int x = sc.nextInt();
System.out.print("Enter n = ");
int n = sc.nextInt();

// Calculate_Power() Function call
 int Result = Calculate_Power(x,n);
 System.out.print("x^n : ");
 System.out.println(Result);  
 sc.close();
}
  }


  
  
