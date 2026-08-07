import java.util.Scanner;
public class Recursion_Fibonacci {

//Fibonacci Series
public static void Fibonacci(int a, int b,int n){
    //Base Condition
    if(n==0){
        return;
    }
    int c = a+b;
    System.out.print(c+" ");
    Fibonacci(b,c,n-1);
      System.out.println(n-1);
}
  
//Exact value in Fibonacci Sequence
public static int Fibo(int a, int b, int n){
    if(n == 1){
        return a;
    }
    if(n == 2){
        return b;
    }
    return Fibo(a, b, n - 1) + Fibo(a, b, n - 2);
}
  
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter number : ");
  int n = sc.nextInt();

// Fibonacci() Function call
  int a=0, b=1;
  if(n<3 && n>0) {
    // Nested if
    if(n==1)
        System.out.print("Fibonacci Sequence : "+a);
    if(n==2)
        System.out.println("Fibonacci Sequence : "+a+" "+b+" ");
   }
  else if(n<=0){
    System.out.println("Sequence Invalid!");
   }
 else {
    System.out.print("Fibonacci Sequence : "+a+" ");
    System.out.print(b+" ");
    Fibonacci(a,b,n-2);
    System.out.println();
}
// Fibo() Function call
if(n>0){
int call = Fibo(a,b,n);
System.out.print("The nth Term : ");
System.out.println(call);}
else{
    System.out.println("Value Invalid!");
}
  sc.close();
}
}
