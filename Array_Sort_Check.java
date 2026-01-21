import java.util.Scanner;
public class Array_Sort_Check {
    public static void main(String[] args) {
// Check Sorting of an Array
Scanner sc = new Scanner(System.in);     
System.out.print("Provide Array size : ");
int s = sc.nextInt();

//Declare 1-D Array
int[] sort = new int[s];
      
//Input
for (int i = 0; i < sort.length; i++) {
System.out.print("Enter value " + (i + 1) + " = ");
//Take integer array as input
sort[i] = sc.nextInt();
      }
      
boolean ascending = true;
boolean descending = true;
for (int i = 0; i < sort.length - 1; i++) {
if (sort[i] > sort[i + 1]) {
      ascending = false;
  }
if (sort[i] < sort[i + 1]) {
        descending = false;
}
    }
if (ascending) {
System.out.println("Sorted in Ascending order");}
  else if (descending) {
  System.out.println("Sorted in Descending order");}
    else {
       System.out.println("Neither in Ascending nor in Descending order");
        }
    }
    sc.close();
}
