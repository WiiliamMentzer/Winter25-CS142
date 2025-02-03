import java.util.*;
import java.io.*;

//Lecture 7 by William Mentzer
//For Class: CS-142

public class Lecture07 {

  public static void boysGirlsDuel() throws FileNotFoundException {
    Scanner userText = new Scanner(new File("boygirlnames.txt"));
    int boysScore = 0;
    int boysTotal = 0;

    boolean boyOrGirl = true;

    int girlsScore = 0;
    int girlsTotal = 0;
    for(int i=0; i < 7 ; i++) {
      if(boyOrGirl){
        userText.next();
        boysTotal += 1;
        boysScore += userText.nextInt();
        boyOrGirl = false;
      } else {
        userText.next();
        girlsTotal += 1;
        girlsScore += userText.nextInt();
        boyOrGirl = true;
      }
    }

    System.out.printf("%d boys, %d girls \n", boysTotal, girlsTotal);
    System.out.printf("Difference between boys' and girls' sums: %d", Math.abs(boysScore - girlsScore));
  }
  public static void main(String[] args)  throws FileNotFoundException{
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

    // Put your answer for #3 here:
    //B

    // Put your answer for #5 here:
    // (The answer will be one of "A" or "B" or "C" or "D" or "E")
    //A

    // Put your answer for #7 here:
    //5 tokens
    // nextInt nextInt nextDouble next next

    // EXERCISES:

    // Put your answer for #1 here:
    // You will need to add the method in above main(), but then call it here
    boysGirlsDuel();
  }
}
