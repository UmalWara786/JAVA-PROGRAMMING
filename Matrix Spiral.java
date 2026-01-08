import java.util.Scanner;
public class Arrays {
public static void main(String[] args) {
//Spiral order matrix
Scanner sc = new Scanner(System.in);
System.out.println("Enter order of matrix (m*n)");
System.out.print("Enter m : ");
int m = sc.nextInt();
System.out.print("Enter n : ");
int n = sc.nextInt();
char[][] spiral = new char[m][n];
//Input
for(int i=0; i<m; i++){
    for(int j=0; j<n; j++){
System.out.print("Enter value at ["+i+"]["+j+"] : ");
spiral[i][j] = sc.next().charAt(0);
           }
System.out.println();
        }

//Output
System.out.println("The spiral order matrix -> ");
int rowStart = 0;
int rowEnd = m-1;
int colStart = 0;
int colEnd = n-1;

//Print Spiral order matrix
while (rowStart<=rowEnd && colStart<=colEnd){
 //1
for (int col=colStart; col<=colEnd; col++){
System.out.print(spiral[rowStart][col]+" ");
           }
rowStart++;
 //2
for (int row=rowStart; row<=rowEnd; row++){
System.out.print(spiral[row][colEnd]+" ");
          }
colEnd--;
  //3
for (int col=colEnd; col>=colStart; col--){
System.out.print(spiral[rowEnd][col]+" ");
          }
rowEnd--;
//4
for (int row=rowEnd; row>=rowStart; row--){
System.out.print(spiral[row][colStart]+" ");
           }
colStart++;
System.out.println();
        }
}
}
