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

// Floor() Function call
// Floor size
 int rows=7, coloumns=4;
 int outcomes = Floor(rows,coloumns);
  
 System.out.print("Possible placements --> ");
 System.out.println(outcomes);
}
}
