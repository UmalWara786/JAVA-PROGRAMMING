import java.util.Scanner;
public class Advance_Recursion_Tiles_Problem {

// Place Tiles of size 1*m in a floor of size n*m
public static int Floor(int n,int m){
// Base conditions
  if(n==m){
  return 2;
    }
  if(n<m){
  return 1;
    }
  
// Vertically
  int vertical_Placements = Floor(n-m,m);
// Horizontally
  int horizontal_Placements = Floor(n-1,m);
  
  return vertical_Placements+horizontal_Placements;
}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);

// Guests() Function call
 System.out.print("Enter number of guests : ");
 int n = sc.nextInt();
 System.out.print("Possible ways to invite : ");
 int Result = Guests(n);
  
 System.out.println(Result);
 sc.close();
}
}
