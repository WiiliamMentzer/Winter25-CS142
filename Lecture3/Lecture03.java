/* Lecture 03
 By: William Mentzer CS142
*/
public class Lecture03 {

    public static double exponentialCount(int e, double x){
        for(int i=0; i<e; i++){
            x *= x;
        }
        return x;
    }

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

    //PE MD AS

    // Put your answer for #3A here:
    //8

    // Put your answer for #3B here:
    //11

    // Put your answer for #3C here:
    //6

    // Put your answer for #3D here:
    //4

    // Put your answer for #3E here:
    //33

    // Put your answer for #3F here:
    //-16

    // Put your answer for #3G here:
    //5Mike4

    // Put your answer for #3H here:
    //6 2 * 3

    // Put your answer for #7 here:
    // Make sure that the code that you write here compiles and runs
    //
    int age = 24;
    String gender = "Male";
    double height = 6.08333; //ft in decimal format
    int weight = 185; // stored in rounded up to nearest whole number pound

    // Put your answer for #18 here:
    // Make sure that the code that you write here compiles and runs
    double x = 0;
    double y = (12.3 * exponentialCount(4, x)) - (9.1*exponentialCount(3, x)) + (19.3 * exponentialCount(2, x)) - (4.6*x) + 34.2;
    System.out.println(y);
    //Curious if this was the desired idea, maybe it just didnt click with me but i would love some input on whether this is a valid anser since i made a method to handle the exponents, i didnt know whether you wanted x to be a real number or not for testing but the method should work as an exponent calculator :)

    // Put your answer for #21 in the static method
    // named "Exercise_21_Finish_Me" down below
    //
    // In order for the auto-graded tests to pass you MUST uncomment the next line:
    Exercise_21_Finish_Me(); // _UN_COMMENT THIS LINE!!!!

    int total = 25;
    for (int number = 1; number <= (total / 2); number++) {
        total = total - number;
        System.out.println (total +" "+ number);
    }

    // Put your answer for #25 here:
    // 24 1
    // 22 2
    // 19 3
    // 15 4
    // 10 5
    //
    // I Initially thought that since total was outside of the for loop that the scope wouldnt allow the int total to be modified, but i forgot that when its in the same method, it is modified.

    // EXERCISES:

    // Put your answer for #4 here:
    for(int a=0; a<4 ;a++){
        for(int b=0; b<5 ;b++){
            System.out.print("*");
        }
        System.out.println("");
    }

    // Put your answer for #5 here:
    for(int a=0; a<=4 ;a++){
        for(int b=5-a; b <= 5 ;b++){
            System.out.print("*");
        }
        System.out.println("");
    }
    // Put your answer for #6 here:
    for(int a=1; a<=7 ;a++){
        for(int b=7-a; b < 7 ;b++){
            System.out.print(a);
        }
        System.out.println("");
    }
  }

  // In VSCode you can press Ctrl/Cmd + / to uncomment a bunch of lines at once
  // (select the lines, then Ctrl+/)
  public static void Exercise_21_Finish_Me() {
    for (int i = 1; i <= 4; i++) {
        System.out.println("2 times " + i + " = " + (i*2));
    }
  }

}
