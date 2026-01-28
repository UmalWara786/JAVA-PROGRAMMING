import java.util.Scanner;
public class Recursion_Keypad_Solution {
  
// Keypad Combination Function --> Time Complexity = O(4^n)
// Static part of code
public static String[] Keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
  
public static void keypad_Combination(String s,int index, String combination){
// Base case
  if (index == s.length()) {
    if (s.length() == 1) {
      System.out.println("Possible outcome : " + combination);
    } else {
      System.out.println("Possible keypad combinations : " + combination);
      }
      return;
    }
  
 char Current = s.charAt(index);
 String Mapping = Keypad[Current - '0'];
  
 for (int i = 0; i < Mapping.length(); i++) {
 keypad_Combination(s, index + 1, combination + Mapping.charAt(i));
  }
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// keypad_Combination() Function call
 System.out.print("Enter key combinations : ");
 String key = sc.next();
 keypad_Combination(key,0," ");
 sc.close();
}
}
