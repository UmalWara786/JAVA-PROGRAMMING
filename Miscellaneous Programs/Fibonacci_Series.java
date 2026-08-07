import java.util.Scanner;
public class Fibonacci_Series {

//Fibonacci Series
//Userdefined Function
public static void fib(int n ){
int a = 0, b = 1;
 for(int i = 1; i <= n; i++){
    System.out.print(a );
    if(i<n){
        System.out.print(",");
      }
      else{
          System.out.print(" ");}
  int sum = a + b;
  a = b;
  b = sum;
    }
}

//Main Method
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.print("Enter limit value : ");
int lim =sc.nextInt();
  
//Fib Function call
fib(lim);  
sc.close();
}
}

  
