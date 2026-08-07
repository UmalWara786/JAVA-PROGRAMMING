import java.util.Scanner;
public class Recursion_Sorted_Check {

//Check if an Array is sorted (decreasing) --> Time Complexity = O(n)
public static boolean Sorting(int arr[],int index){
  //Base Condition
    if(index==0){
        System.out.print("Sorting Status (decreasing) : ");
        return true;
    }
  
    if(arr[index]<arr[index-1]){
        //Array is sorted till now
        return Sorting(arr,index-1);
    }
    else {
        System.out.print("Sorting Status (decreasing) : ");
        return false;
    }
  
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

// Sorted() Function call
 System.out.print("Enter array size : ");
 int size = sc.nextInt();
  
 int[] arr = new int[size];
  
 //Input
 for (int i=0;i<size;i++){
    System.out.print("Enter "+i+"th element : ");
    arr[i] = sc.nextInt();
 }
 boolean Ans = Sorted(arr,size-1);
 System.out.println(Ans);
 sc.close();
}
 }
