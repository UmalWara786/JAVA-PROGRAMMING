// This program shows the sales in a mart in morning and evening and shows their sales sum

public class Array_Sales_Calculation {
public static void main(String[] args){
//Calculate Sales
  
System.out.println("\"Sales Calculation\"");
int[][] Sales = {{90,89}, {87,67}, {90,54}, {30,81}, {65,21}};
  
System.out.println("\"Manually\"");
System.out.println(Sales[0][0]);
System.out.println(Sales[0][1]);
System.out.println("\"With loops\"");
//Coloumn Sum
int sum_1 = 0;
int sum_2 = 0;
  
System.out.println("     C0  C1");
for (int i=0; i<Sales.length; i++){
    int row_sum = 0;
    System.out.print("R"+i+" ");
    System.out.print("|");
    for (int j=0; j<Sales[i].length; j++){
        System.out.print(" "+Sales[i][j]+" ");
        //Each day Calculation
        row_sum += Sales[i][j];
    }
    System.out.print("|");
  
    System.out.print("  --> Morning and Evening Sales per day : "+row_sum);
    sum_1 += Sales[i][0];
    sum_2 += Sales[i][1];
    System.out.println();
}
  
//Calculate sum
System.out.print("    "+sum_1+"  ");
System.out.println(sum_2);
}
}
