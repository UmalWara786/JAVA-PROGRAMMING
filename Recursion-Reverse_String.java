import java.util.Scanner;
public class Recursion-Reverse_String {
  
//Print String in Reverse --> Time Complexity = O(n)
 public static void Reverse(String s,int index){
 // Base Condition  
 if(index==0){
  System.out.println(s.charAt(index));
  return;
    }
   
  System.out.print(s.charAt(index));
  Reverse(s,index-1);
}

public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
// Reverse() Function call
 System.out.print("Enter String : ");
 String s = sc.nextLine();
  
 int index = s.length()-1;
 System.out.print("Reverse -> ");
 Reverse(s,index);
 sc.close();
}
 }
