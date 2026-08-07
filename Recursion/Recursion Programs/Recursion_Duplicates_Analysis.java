import java.util.Scanner;
public class Recursion_Duplicates_Analysis {

 //Remove Duplicates --> Time Complexity = O(n)
 // Static Part of code
 public static boolean[] Array = new boolean[26];
  
 public static void Remove(String s,int index,String New_String){
  // Base Case
    if(index==s.length()){
    System.out.println("Modified String : "+New_String);
    return;
    }
   
  char Current = s.charAt(index);
// ASCII values
  if((Current>=97 && Current<=122) || Current==' ') {
  // With space condition
  if (Current == ' ') {
  New_String += ' ';  
  Remove(s, index + 1, New_String);
  }
  else {
  if (Array[Current - 'a'] == true) {
  Remove(s, index + 1, New_String);
  } else {
  New_String += Current;
  Array[Current - 'a'] = true;
  Remove(s, index + 1, New_String);
             }
         }
     }
  else{
  System.out.println("Please! Avoid Special characters");
  System.out.println("This program is only for small alphabetical characters");
     }
 }

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Remove() Function call
 System.out.print("Enter String : ");
 String s = sc.nextLine();
 
 Remove(s,0,"");
 sc.close();
}
  }
