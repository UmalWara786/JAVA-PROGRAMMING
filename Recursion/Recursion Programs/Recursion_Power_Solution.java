import java.util.Scanner;
public class Recursion_Power_Solution {

// Recursion approach
//Calculate Power --> Stack height = n
public static int Power(int x, int n){
    //Base Conditions
    if(n==0){
        System.out.print("x^n = ");
        return 1;
    }
    if(x==0){
        System.out.print("x^n = ");
        return 0;
    }
   int call = Power(x,n-1);
   int calculate = x*call;
   return calculate;
}

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
// Power() Function call
 System.out.print("Enter x = ");
 int x = sc.nextInt();
 System.out.print("Enter n = ");
 int n = sc.nextInt();
  
 int Ans = Power(x,n);
 System.out.println(Ans);
 sc.close();
 }
  }
