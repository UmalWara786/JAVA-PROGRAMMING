import java.util.Scanner;
public class Recursion_Implementation {

// Recursion Approach  
// Sum of n natural numbers
public static void Do_Sum(int n, int sum){
    //Base Condition
    if(n<1){
        System.out.println("Sum of n natural numbers -> "+sum);
        System.out.print("The numbers whose sum is calculated : ");
        return;
    }
    sum+=n;
    Do_Sum(n-1,sum);
    System.out.print(n+" ");
}  

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter number : ");
  int n = sc.nextInt();

//Do_Sum Function call
  Do_Sum(n,0);
  sc.close();
}
}
