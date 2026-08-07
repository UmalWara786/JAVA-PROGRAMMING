import java.util.Scanner;
public class Recursion_Find_Occurance {

 //Find Occurance of Character --> Time Complexity = O(n)
 // Static variables
 public static int First = -1;
 public static int Last = -1;
 public static int count = 0;
  
 public static void Occurance(String s, char element, int index){
//Base Condition
if(index==s.length()){
  if(count!=0){
    System.out.println("First occurance : "+First+"th index");
    System.out.println("Last occurance: "+Last+"th index");}
  else{
    System.out.println("Invalid character!");
         }
if(count>1){
    System.out.println("Number of occurance of "+element+" -> "+count+" times");}
else{
    System.out.println("Number of occurance of "+element+" -> "+count+" time");}
    return;
     }
   
char Current_char = s.charAt(index);
if(Current_char==element){
count++;
if(First==-1){
First = index;
    }
else{
Last = index;
      }
// For only one occurance
if(First!=-1 && Last==-1){
  Last = index;
    }
}
   
Occurance(s,element,index+1);
     }
  
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
  
// Occurance() Function call
 System.out.print("Enter String : ");
 String s = sc.nextLine(); 
 System.out.print("Enter char for finding its occurance : ");
 char element = sc.next().charAt(0);
  
 Occurance(s,element,0);
 sc.close();
}
 }
