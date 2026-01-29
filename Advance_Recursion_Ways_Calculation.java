import java.util.Scanner;
public class Advance_Recursion_Ways_Calculation {

// Find the number of ways in which you can invite 'n' people to your party, single or in pairs
  public static int Guests(int n){
  if(n<=1){
  return 1;
    }
// Single
   int way1 = Guests(n-1);
// Pair
  int way2 = (n-1)*Guests(n-2);
   return way1+way2;
}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);

// Guests() Function call
System.out.print("Enter number of guests : ");
int n = sc.nextInt();
System.out.print("Possible ways to invite : ");
int Result = Guests(n);
  
System.out.println(Result);
sc.close();
}
}
