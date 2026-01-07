import java.util.Scanner;
public class Main {
    public static void main(String[] args){
//checking frequency of numbers
  double num;
  int input;
  int countp = 0;
  int countn = 0;
  int countz = 0;
  Scanner sc = new Scanner(System.in);
  do{
  System.out.print("Enter any number : ");
  num = sc.nextDouble();
  if(num>0){
//Count positive numbers
  countp++;
      }
   else if(num<0){
//Count negative numbers
   countn++;
      }
      else{
 //Count number of zeros
    countz++;
     }
 System.out.println("Do you want to continue?");
 System.out.print("1(yes), 0(no)"+"->");
 input=sc.nextInt();
  }while(input==1);
 System.out.print("The positive numbers entered : ");
 System.out.println(countp);
 System.out.print("The negative numbers entered : ");
 System.out.println(countn);
 System.out.print("The  number of zeros entered : ");
 System.out.println(countz);

    }
}
