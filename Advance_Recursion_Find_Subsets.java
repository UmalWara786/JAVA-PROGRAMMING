import java.util.ArrayList;
import java.util.Scanner;
public class Advance_Recursion_Find_Subsets {

// Print all the subsets of a set of first n natural numbers -->Time Complexity = O(2^n)

public static void Print_subsets(ArrayList<Integer> subset){
    for(int i=0; i<subset.size(); i++){
        System.out.print(subset.get(i)+" ");
    }
    System.out.println();
}

public static void Find_Subsets(int n, ArrayList<Integer> subset){
  // Base case
    if(n==0){
        Print_subsets(subset);
        return;
    }

  // To be
    subset.add(n);
    Find_Subsets(n-1,subset);

  // To not be
    subset.remove(subset.size()-1);
    Find_Subsets(n-1,subset);
}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);

// Find_Subsets() Function call
  System.out.print("Enter number of elements : ");
  int input = sc.nextInt();
  
  ArrayList<Integer> subset = new ArrayList<>();
  System.out.println("Possible subsets : ");
  
  Find_Subsets(input,subset);
  sc.close();
}
}
  
