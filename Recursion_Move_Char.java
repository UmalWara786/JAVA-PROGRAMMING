import java.util.Scanner;
public class Recursion_Move_Char {

//Move a Specific type of char at the end of String --> Time Complexity = O(n)
// Static variable
public static int count = 0;
  
 public static void Move(String s,char input, int index,String New_String){
  //  Base Case
  if(index==s.length()){
  //Nested if
  if(count!=0){
  for(int i=1; i<=count; i++){
  New_String +=input;
      }
  System.out.println("New modified String : "+New_String);
        }
  else{
  System.out.println("Invalid char!");
  System.out.println("The \'"+input+ "\' char is not found in \""+s+"\"");
  System.out.println("String will remain same!");
  System.out.println("New String --> Original String : "+s);
        }
  return;
    }
   
  char Current = s.charAt(index);
  if(Current==input){
  count++;
  Move(s,input, index+1,New_String);
    }
  else {
  New_String +=Current;
  Move(s,input, index+1,New_String);
    }
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

//  Move() Function call
System.out.print("Enter String : ");
String s = sc.nextLine();
System.out.print("Enter char that you want to shift : ");
char input = sc.next().charAt(0);
  
Move(s,input,0,"");
sc.close();
}
}
