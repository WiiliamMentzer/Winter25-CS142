import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Lecture 8 by William Mentzer
//For Class: CS-142

public class Lecture08 {

  public static void someTextProjection() throws FileNotFoundException {
    Scanner someTextInput = new Scanner (new File("someText.txt"));
    System.out.println("+--------------+" );
    System.out.println("| "+ someTextInput.nextLine() + " |" );
    System.out.println("| "+ someTextInput.nextLine() + "   |" );
    System.out.println("+--------------+");
  }

  public static void flipLines(Scanner input) {
    String flipLine1 = "";
    String flopLine2 = "";

    for (int i=0; i < 2; i++){
      flipLine1 = input.nextLine();
      flopLine2 = input.nextLine();

      System.out.println(flopLine2);
      System.out.println(flipLine1);
    }
  }

  public static void main(String[] args) throws FileNotFoundException {
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

    // Put your answer for #12 here:
    // NOTE: FIRST try to predict what the output will be WITHOUT actually running the program
    // write down your answer here

    /*
    Output:

    input: 6.7         This file has several input lines. 
    input: 10 20                 30 40
    input: test
    3 total
    */
    Scanner input = new Scanner (new File("readme.txt")) ;
    int count = 0;
    while (input.hasNext() ) {
        System.out.println("input: "+ input.next() );
        count++;
    }
    System.out.println(count + " total");

    // LASTLY compare the two results and if they're different go back and figure out
    // why the computer's output is different from what you predicted.

    // Put your answer for #13 here:
    // (Do this like #5A - predict, write your prediction, run the code, then explain any differences)

    /*
      input: 6.7
      input: This
      input: file
      input: has
      input: several
      input: input
      input: lines.
      input: 10
      input: 20
      input: 30
      input: 40
      input: test
      12 total

      Essentially this is count everything because it is all protected and counted for next()
    */


  
    // Put your answer for #14 here:

    //the output would look something like this:
    /*
    input: 6
    input: 7
    input: 10
    input: 20
    input: 30
    input: 40
    4 total
     */

    /*
     * actual output:
     * 0 total
     * 
     * My guess is because that the first number is not an int technically its a double the program just crashes out and the while loop breaks.
     */


    // Put your answer for #18 here:

    someTextProjection();

    Scanner inputPoem = new Scanner(new File("aFinePoem.txt"));
    flipLines(inputPoem);

    // EXERCISES:

    // Put your answer for #7 here:
    // You will need to add the method in above main(), but then call it here
  }
}
