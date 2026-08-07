public class Recursion_Tower_of_Hanoi {
  
 // Tower of Hanoi  --> Time complexity = O(2^n)
 public static void Tower(int n, String source, String helper, String destination ){
//Base Condition
  if(n==1){
  System.out.println("Transfer disk from "+source+" to "+destination);
  return;
     }
   
  Tower(n-1,source,destination,helper);
  System.out.println("Transfer disk from "+source+" to "+destination);
  Tower(n-1,helper,source,destination);
 }

public static void main(String[] args) {
 //Tower() Function call
  Tower(n,"S","H","D");
  sc.close();
}
}
