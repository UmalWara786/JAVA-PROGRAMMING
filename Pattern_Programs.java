public class Pattern_Programs {
    public static void main(String[] args) {
//Pattern Problems Solution
//Nested For loop Concept
        
//Solid Rectangle
 int rows = 4, coloums = 5;
//Rows
 for (int i = 1; i <= rows; i += 1) {
//Coloumns
     for (int j = 1; j <= coloums; j = j + 1) {
         System.out.print("*");
     }
     System.out.println();
 }

//Hollow Rectangle
rows = 4; coloums = 5;
//Rows
for (int i = 1; i <= rows; i++) {
//Coloumns
    for (int j = 1; j <= coloums; j++) {
        if (i == 1 || i == rows || j == 1 || j == coloums) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println();
} 

//Half Pyramid
 rows = 4; coloums = 5;
//Rows     
  for (int i = 1; i <= rows; i++) {
//Coloumns
      for (int j = 1; j <= i; j++) {
          System.out.print("*");
      }
      System.out.println();
  }

//Half Pyramid with numbers
int r = 6;
//Rows
for (int i = 1; i < r; i++) {
//Coloumns
    for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
      
//Inverted Half Pyramid
rows = 4; coloums = 5;
//Rows        
for (int i = rows; i >= 1; i--) {
//Coloumns
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}

//Inverted Half Pyramid with numbers
int c = 6;
//Rows
 for (int i = c; i >= 1; i--) {
//Coloumns
     for (int j = 1; j <= i; j++) {
         System.out.print(j + " ");
     }
     System.out.println();
 }
      
//Inverted Half Pyramid (Rotated at 180 deg)
rows = 4; coloums = 5; 
 for (int i = 1; i <= rows; i += 1) {
     //Inner loop -> Space print
     for (int j = 1; j <= rows - i; j++) {
         System.out.print(" ");
     }
     //Inner loop -> Star print
     for (int k = 1; k <= i; k++) {
         System.out.print("*");
     }
     System.out.println();
 }

//Floyd's Triangle
 int n = 5;  //number of rows
 int number = 1;
//Rows
 for (int i = 1; i <= n; i += 1) {
//Coloumns
     for (int j = 1; j <= i; j++) {
         System.out.print(number + " ");
         number++;
     }
     System.out.println();
 }

// 0-1 Triangle
n = 5;
//Rows
for (int i = 1; i <= n; i++) {
//Coloumns
    for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0)
            System.out.print("1" + " ");
        else
            System.out.print("0" + " ");
    }
    System.out.println();
}

    }
}
