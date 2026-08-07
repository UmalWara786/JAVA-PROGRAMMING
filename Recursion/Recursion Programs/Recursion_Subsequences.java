import java.util.HashSet;
import java.util.Scanner;
public class Recursion_Subsequences {
  
//Subsequences Function --> Time Complexity = O(2^n)
// Calculate Subsequences = 2^n
public static void Subsequences(String s,int index,String New_String,HashSet<String> set){
// Base Condition
  if(index==s.length()){
  //Repeated
  if(set.contains(New_String)){
  return;
  }
  //Non Repeated
  else{
  System.out.println("Subsequences : "+New_String);
  set.add(New_String);
  return;}
    }
  
  char Current = s.charAt(index);
  //To be
  Subsequences(s,index+1,New_String+Current,set);
  //Not to be
  Subsequences(s,index+1,New_String,set);
}

public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
  
// Subsequences() Function call
 System.out.print("Enter String : ");
 String s = sc.nextLine();

// For unique values
 HashSet<String> set = new HashSet<>();
 Subsequences(s,0," ",set);
 sc.close();
   }
   }
