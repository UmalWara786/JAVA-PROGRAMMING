public class Pattern_Design. {
    public static void main(String[] args) {
//Printing Patterns
      
// Solid Rhombus
 int stars = 5;
 for (int i = stars; i >= 1; i--) {
     //Inner Loop for spaces
     for (int j = 1; j < i; j++) {
         System.out.print(" ");
     }
     //Inner loop for stars
     for (int k = 1; k <= stars; k++) {
         System.out.print("*");
     }
     System.out.println();
 }

// Number Pyramid
stars = 5;
//Outer loop -> number of rows times running
for (int i = 1; i <= stars; i += 1) {
//Inner Loop for spaces
    for (int j = i; j < stars; j++) {
        System.out.print(" ");
    }
//Inner loop for values
    for (int k = 1; k <= i; k++) {
        System.out.print(i + " ");
    }
    System.out.println();
}

// Palindromic number Pyramid
stars = 5;
for (int i = 1; i <= stars; i++) {
    //Print spaces
    for (int j = 1; j <= stars - i; j
        System.out.print(" ");
    }
    // Print Descending numbers
    for (int k = i; k >= 1; k--) {
        System.out.print(k);
    }
    // Print Ascending numbers
    for (int l = 2; l <= i; l++) {
        System.out.print(l);
    }
    System.out.println();

// Butterfly Pattern
   stars = 4;
// Upper part
 for (int i = 1; i <= stars; i++) {
//  1st part
     for (int j = 1; j <= i; j++) {
         System.out.print("*");
     }
  // Spaces
  int spaces = 2 * (stars - i);
  for (int k = 1; k <= spaces; k++) {
      System.out.print(" ");
     }
// 2nd part
  for (int l = 1; l <= i; l++) {
    System.out.print("*");
     }
     System.out.println();
 }
  // Lower part
 for (int i = stars; i >= 1; i--) {
  //  1st part
     for (int j = 1; j <= i; j++) {
         System.out.print("*");
     }
  // Spaces
     int spaces = 2 * (stars - i);
     for (int k = 1; k <= spaces; k++) {
         System.out.print(" ");
     }
    // 2nd part
     for (int l = 1; l <= i; l++) {
         System.out.print("*");
     }
     System.out.println();
 }

// Diamond Pattern
 stars = 4;
 //Upper part
 for (int i = 1; i <= stars; i++) {
// Spaces
     for (int j = 1; j <= stars - i; j++) {
         System.out.print(" ");
     }
// Print Stars
     for (int k = 1; k <= (2 * i) - 1; k++) {
         System.out.print("*");
     }
     System.out.println();
 }
 //Lower part
 for (int i = stars; i >= 1; i--) {
// Spaces
     for (int j = 1; j <= stars - i; j++) {
         System.out.print(" ");
     }
// Print Stars
     for (int k = 1; k <= (2 * i) - 1; k++) {
         System.out.print("*");
     }
     System.out.println();
 }
}
    }
