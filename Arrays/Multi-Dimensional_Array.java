// 3D Array initialization and print its value after sorting each 1D Array in it.

import java.util.Arrays;
public class Multi-Dimensional_Array {
    public static void main(String[] args){
      int[][][] arr = new int[3][3][2];
        arr[0][0][0] = 9;
        arr[0][0][1] = 2;
        arr[0][1][0] = 1;
        arr[0][1][1] = 6;
        arr[0][2][0] = 7;
        arr[0][2][1] = 4;
      
        arr[1][0][0] = 1;
        arr[1][0][1] = 2;
        arr[1][1][0] = 3;
        arr[1][1][1] = 5;
        arr[1][2][0] = 9;
        arr[1][2][1] = 4;
      
        arr[2][0][0] = 2;
        arr[2][0][1] = 6;
        arr[2][1][0] = 9;
        arr[2][1][1] = 5;
        arr[2][2][0] = 1;
        arr[2][2][1] = 0;
    

  // 2D Array    
    for(int i=0; i<arr.length; i++){
  // 1D Array
     for(int j=0; j<arr[i].length; j++){
      System.out.print("|");
      Arrays.sort(arr[i][j]);
    // Each element of 1D array
         for(int k=0; k<arr[i][j].length; k++){
            System.out.print(" "+arr[i][j][k]+" ");
        }
        System.out.println("|");
    }
    System.out.println();
}   
      
    }
}
