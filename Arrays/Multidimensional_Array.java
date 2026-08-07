public class Multidimensional_Array {
public static void main(String[] args){
//2D Array
  
int[][] Multi_Array = {{89,99}, {90,12}, {56,90}};
  
System.out.println("\"Multi dimensional Array\"");
//Nested loop concept
for (int i=0; i<Multi_Array.length; i++){
    for (int j=0; j<Multi_Array[i].length; j++){
        System.out.println("Value at ["+i+"]["+j+"] index : "+Multi_Array[i][j]);
    }
}
System.out.println();
  
//Matrix Form
System.out.println("\"Matrix Form\"");
//Rows
for (int i=0; i<Multi_Array.length; i++){
    System.out.print("|");
//Coloumns
    for (int j=0; j<Multi_Array[i].length; j++){
        System.out.print(" "+Multi_Array[i][j]+" ");
    }
    System.out.println("|");
}
}
}
