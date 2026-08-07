import java.util.Scanner;
public class Advance_Recursion_Permutation {

// Print Permutation Function  --> Time Complexity = O(n!)
//Static variable
public static int count = 0;

public static void Print_Permutation(String s, String permutation){
//Base Case
  if(s.length()==0){
  if(count==1){
  System.out.println("Possible outcome : "+permutation);}
  else{
  System.out.println("Possible combinations : "+permutation);
       }
  return;
   }
  
  for(int i=0; i<s.length(); i++){
  count++;
  char Current = s.charAt(i);
  //"abc" -> "bc"
  String New_String = s.substring(0,i)+s.substring(i+1,s.length());
  Print_Permutation(New_String,permutation+Current);
    }
}
  
public static void main(String[] args){
// Print_Permutation() Function call
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter String : ");
  String input = sc.nextLine();
  
  Print_Permutation(input,"");
  sc.close();
}
}
