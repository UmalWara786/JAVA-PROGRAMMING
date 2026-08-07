public class Advance_Recursion_Paths_Catculate {

// Calculate total paths in a maze to move from (0,0) to (n,m) --> Time Complexity = O(2^m+n)
 public static int Paths(int i,int j,int n,int m){
// Base Conditions
  if(i==n || j==m){
  return 0;
     }
  if((i==n-1) && (j==m-1)){
  return 1;
     }

// Move Downwards
  int Down_Paths = Paths(i+1,j,n,m);
// Move Right
  int Right_Paths = Paths(i,j+1,n,m);

  return Down_Paths+Right_Paths;
 }

public static void main(String[] args){
// Paths() Function call
 int rows=4, coloumns=4;
  
 int Total_Paths = Paths(0,0,rows,coloumns);
 System.out.println("Total possible paths : "+Total_Paths);
}
}
