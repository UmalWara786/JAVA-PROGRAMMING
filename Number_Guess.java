import java.util.Scanner;
public class Number_Guess {
public static void main(String[] args){
// Number guessing game
Scanner sc = new Scanner(System.in);
int myNumber = (int)(Math.random() * 100); // 0–99
int userNumber;
int attempts = 0;
 do {
 System.out.print("Guess my number: ");
 userNumber = sc.nextInt();
 //Counting number of attempts
 attempts++;

 if (userNumber == myNumber) {
 System.out.println("WOOHOO! Correct number!!!");
 break;
    }
 else if (userNumber > myNumber) {
 System.out.println("Your number is too large");
    }
 else {
 System.out.println("Your number is too small");
    }
    } while (userNumber >= 0);

  System.out.println("My number was: " + myNumber);
  if (userNumber == myNumber) {
  System.out.println("You made the correct guess in " + attempts + " tries!");
  if (attempts < 5)
  System.out.println("Great job!!!");
  else if (attempts < 10)
  System.out.println("Best!!");
  else
  System.out.println("Good!");
         }
 sc.close();
            }
        }
