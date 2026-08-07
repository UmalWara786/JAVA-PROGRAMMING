public class Print_Patterns {
    public static void main(String[] args) {
// Advance Patterns Solution
// Nested For Loop Concepts
      
// Hollow Butterfly
int stars=5;
// Upper part
  for(int i=1; i<=stars; i++){
// 1st part
   for(int j=1; j<=stars; j++){
      if(j==1 || i==j){
             System.out.print("*");
         }
         else
             System.out.print(" ");
     }
// Spaces
     for(int k=1; k<=stars-i; k++){
         System.out.print(" ");
     }
//2nd part
     for(int l=1; l<=stars; l++){
         if(l==1 || l==i)
             System.out.print("*");
         else
             System.out.print(" ");
     }
     System.out.println();
 }
 // Lower part
 for(int i=stars; i>=1; i--){
// 1st part
    for(int j=1; j<=stars; j++){
    if(j==1 || i==j){
        System.out.print("*");
         }
      else
         System.out.print(" ");
     }
// Spaces
  for(int k=1; k<=stars-i; k++){
    System.out.print(" ");
     }
// 2nd part
  for(int l=1; l<=stars; l++){
    if(l==1 || l==i)
        System.out.print("*");
        else
           System.out.print(" ");
     }
     System.out.println();
 }

// Hollow Rhombus
stars=5;
for(int i=1; i<=stars; i++) {
  //Spaces
    for(int j=1; j<=stars-i; j++){
        System.out.print(" ");
    }
  //Stars
    for(int k=1; k<=stars; k++){
        if(i==1 || i==stars || k==1 || k==stars ){
            System.out.print("*");
        }
        else
            System.out.print(" ");
    }
    System.out.println();
}

// Half Pyramid
stars=5;
// Rows
for(int i=1; i<=stars; i++){
// Coloumns
    for(int j=1; j<=i; j++){
        System.out.print(j+" ");
    }
    System.out.println();
}
//Alternatively
for(int i=1; i<=stars; i++){
    //Spaces
    for(int k=1; k<=stars-i; k++
        System.out.print(" ");
    }
    //Values
    for(int k=1; k<=i; k++){
        System.out.print(k+" ");
    }
    System.out.println();

// Inverted Half Pyramid
 stars=5;
// Rows
 for(int i=1; i<=stars; i++){
// Coloumns
     for(int j=stars; j>=i; j--){
         System.out.print(i+" ");
     }
     System.out.println();
 }
 //Alternatively
 for(int i=1; i<=stars; i++){
     //Spaces
     for(int k=1; k<i; k++){
         System.out.print(" ");
     }
     //Stars
     for(int k=1; k<=stars-i; k++){
         System.out.print(i+" ");
     }
     System.out.println();
 }

// Pascal's Triangle
rows = 5;
for (int i = 0; i < rows; i++) {
    // Print spaces (for triangle shape)
    for (int space = 1; space <= rows - i; space++) {
        System.out.print(" ");
    }
    int numb = 1;  // first value of every row
    for (int j = 0; j <= i; j++) {
        System.out.print(numb + " ");
        // Formula to calculate next value
        numb = numb * (i - j) / (j + 1);
    }
    System.out.println();
}
      
    }
}
