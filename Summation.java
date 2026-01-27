import java.util.Scanner;

public class Summation {
  
//Sum of odd numbers up to n
//Userdefined Function  
public static void Odd(int a){
  int num=0;
  for(int i=1; i<=a; i++){
  if(i%2!=0){
  num=num+i;}
        }
  System.out.println(num);
    }  
//Main Method
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  
System.out.print("Enter a limit number : ");
int limit;
limit = sc.nextInt();
  
// Odd Function call
Odd(limit);
sc.close();
}
}
  
