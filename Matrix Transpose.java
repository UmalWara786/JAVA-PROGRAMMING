import java.util.Scanner;
public class Arrays {
public static void main(String[] args) {
// Transpose of a Matrix
Scanner sc = new Scanner(System.in);
System.out.println("Enter order of matrix (m*n)");
System.out.print("Enter m : ");
int m = sc.nextInt();
System.out.print("Enter n : ");
int n = sc.nextInt();
//m->rows, n->coloumns

//Declaring 2D Array
char[][] transpose = new char[m][n];

// Input
for(int i = 0; i < m; i++){
  for(int j = 0; j < n; j++){
    System.out.print("Enter value at [" + i + "][" + j + "] : ");
      transpose[i][j] = sc.next().charAt(0);
            }
System.out.println();
        }

// Transpose (swap i and j)
System.out.println("Transpose of the matrix : ");
for(int i = 0; i < n; i++){
for(int j = 0; j < m; j++){
System.out.print(transpose[j][i] + " ");
          }
System.out.println();
        }
}
}
