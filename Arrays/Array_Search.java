import java.util.Scanner;
public class Array_Search {
    public static void main(String[] args) {
//Searching element in  a matrix
Scanner sc = new Scanner(System.in);
System.out.println("Enter order of matrix (m*n)");
System.out.print("Enter m : ");
int m = sc.nextInt();
System.out.print("Enter n : ");
int n = sc.nextInt();
//m->rows, n->coloumns

//Declaring 2D Array
char[][] search = new char[m][n];
      
//Input
//Rows
for(int i=0; i<m; i++){
//Coloums
    for(int j=0; j<n; j++){
        System.out.print("Enter value at ["+i+"]["+j+"] : ");
//Taking only one character as a input at a particular index
  search[i][j] = sc.next().charAt(0);
    }
    System.out.println();
}

System.out.print("Enter the value that you want to search : ");
char x = sc.next().charAt(0);
      
//Output
boolean found = false;
for(int i=0; i<m; i++){
    for(int j=0; j<n; j++){
        if(search[i][j]==x){
            System.out.println("Value found at -> ["+i+"]["+j+"] position" );
            found = true;
        }
    }
}
if(!found)
    System.out.println("Invalid value!");
        
        sc.close();
    }
}
