// Lecture 06
//Made by William Mentzer for CS-142

import java.util.Random;
import java.util.Scanner;


public class Lecture06 {

  public static void showTwos(int a) {
    System.out.print(a + " = ");
    do{
      System.out.print("2 * ");
      a = a/2;
    }while(a%2 != 1);
    System.out.print(a);
    System.out.println();
  } 

  public static void printAverage() {
    Scanner userInput = new Scanner(System.in);
    int total = 0;
    int userChoose = 0;
    int usedNums = 0;
    do {
      System.out.print("type a number: ");
      userChoose = userInput.nextInt();
      if(userChoose >= 0){
        total += userChoose;
        usedNums++;
      }
    } while(userChoose >= 0);

    if(usedNums > 0){
      System.out.print("Average was " + (double)(total / usedNums));
    }
  }

  public static void printletters(String text) {
    for (int i = 0; i< text.length (); i++)  {
        System.out.print(text.charAt (i));
        if( i != text.length()-1) {
          System.out.print("-");
        }
    }
    System.out.println(); // to end the line of output
  }

  public static boolean isPrime (int n) {
    boolean prime = true;
    for (int i=2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                System.out.println("False");
            } else {
                prime = true;
                System.out.println("True");
            }
    }
    return prime;
}
  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments
    
    // Put your answer for #5A here:
    // 1 11 21 31 41 51 61 71 81 91

    // Put your answer for #5B here:
    //(nothing)
    // while (10 < 10) will always ring false 10 is not less than 10 , if it were equal to, different story

    // Put your answer for #5C here:
    //bbbbabbbb

    // Put your answer for #6 here:
    Random rng = new Random();
    int ranNum = rng.nextInt(10);

    // Put your answer for #7 here:
    
    //Using rng and ranNum declaration from answer 6 for brevity sake.
    ranNum = 0;
    while(ranNum % 2 == 0){
      ranNum = rng.nextInt(5, 99);
    }


    // Put your answer for #9 here:
    char check = ' ';
    do{
      System.out.println("I am not a number, I am a free man!");
      System.out.println("Hahahah, do you understand? Y/N");
      Scanner userCheck = new Scanner(System.in);
      check = userCheck.next().charAt(0);
    }while(check != 'Y' && check != 'y');

    // Put your answer for #12 here:
    //The issue stems that from regardless the for loop will print a - after each letter. One way to rectify the issue is if you add an if statement at the end that will check if its the last letter in the string and not print the -. My way of doing it is setting a conditional to only print the - if nessecary and will always print after the char printed but never after the final letter in the string.
    printletters("Rabbit");

    // Put your answer for #16 here:
    //Remove the second else statement. We only need to proove that its not prime since we already declared it true. Amend the if statemtnt to be if (n % i == 0){ prime = false}. Thats all thats needed in the loop.

    // EXERCISES:

    // Put your answer for #1 here:
    // You will need to add the method in above main(), but then call it here
    showTwos(68);

    // Put your answer for #12 here:
    printAverage();

  }
}
