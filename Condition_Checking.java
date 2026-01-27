import java.util.Scanner;
public class Condition_Checking {
  
//Checking vote eligibility
//Userdefined Function  
public static void vote(int age){
  if(age>18)
      System.out.println("You are eligible to vote");
  else
      System.out.println("You are not eligible to vote");
}

//Main Method
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

int age;
System.out.print("Enter your age : ");
age = sc.nextInt();
  
//Vote Function call
vote(age);
sc.close();
}
}
