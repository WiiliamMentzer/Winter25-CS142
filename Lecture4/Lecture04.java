/* Lecture 04
    By: William Mentzer for CS142
*/
public class Lecture04 {
    public static void printStrings(String s, int reps) {
        for (int i= 0; i < reps; i++){
            System.out.print(s + " ");
        }
        System.out.println("");
    }

    public static void printGrid(int r, int c) {
        for(int a=1; a <= r; a++){
            for(int b=a; b <= r*c; b+=r){
                System.out.print(b + " ");
            }
            System.out.println("");
        }
    }

    public static void printOdds(int n) {
        for (int i = 1; i <= n; i++) {
            int odd = 2 * i - 1;
            System.out.print(odd + " ");
        }
        System.out.println();
    }

    public static int mystery (int z, int x, int y) {
        z--;
        x = 2 * y + z;
        System.out.println(y + " " + z);
        return x;
    }

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Hello, world!");

        // SELF-CHECK PROBLEMS:
        // Note: you will need to put some of your answers inside a comments

        // Put your answer for #4 here:
        // 1 3 5
        // 1 3 5 7 9 11 13 15
        // 1 3 5 7 9 11 13 15 17 19 21 23 25

        // NOTE: FIRST try to predict what the output will be WITHOUT actually running
        // the program
        // write down your answer here
        //
        // The program will only print the odd numbers counting up the the int input into the method.
        //
        printOdds(3);
        printOdds(17 / 2);
        int x = 25;
        printOdds(37 - x + 1);

        // Put your answer for #10 here:
        // NOTE: You'll need to write the method on, say, line 2
        // (i.e., outside of this main() method)
        // and then call that method right here
        printStrings ("abc", 5);
        //-Noticed there was a test case at the end of the assignment so i called the method here but it also runs down below as well.
        //In the future if i notice another test case, do you want me to run the program and call it when specified, or let the test case handle it?


        // Put your answer for #14 here:
        // (Do this like #4 - predict, write your prediction, run the code, then explain
        // any differences)

        // Prediction:
        // 2 0
        // 1 2 4
        // 1 3
        // 5 2 4
        // 4 1
        // 5 9 4
        //
        // This just scrambles the numbers around but every time 3 ints are input into mystery it replaces the value of one int with another after calculation.
        // Technically its returning x to become the new value of the int from the main method.
        //
        x = 1;
        int y = 2, z = 3;
        z = mystery (x, z, y);
        System.out.println(x + " " + y + " " + z);
        x = mystery (z, z, x);
        System.out.println(x + " " + y + " " + z);
        y = mystery (y, y, z);
        System.out.println(x + " " + y + " " + z);

        /*
        Scanner console = new Scanner (System.in);
        System.out.print("How much money do you have? ");
        double money = console.nextDouble();
        */

        // Put your answer for #22A here:
        //It will store the value 34.50 since it is a double

        // Put your answer for #22B here:
        // It will store the value 6.0 and convert an int to a double

        // Put your answer for #22C here:
        // It wont store a value and it will make an "exception in thread" crash, reason being that the $ in $25.00 is a char and a char cannot be mixed with ints and doubles

        // Put your answer for #22D here:
        // It wont store a value and it will make an "exception in thread" crash, inputting million is a string full of chars and cannot convert to double therefore the value cannot be stored.

        // Put your answer for #22E here:
        // It wont store a value and it will make an "exception in thread" crash, the scanner is looking for the next input and see * as a char and the scanner cannot act upon PEMDAS and do the math, it only takes information not transforms it.

        // Put your answer for #22F here:
        // It wont store a value and it will make an "exception in thread" crash, the scanner is looking for the next input and see x in 600x000 as a char, like before the scanner only eats info not transforms it (unless its an int to double, or string to char, really depends on where youre storing the scanner input)

        // Put your answer for #22G here:
        // This is just going to crash in exception immediately, if its "none" then its a string of chars, if its "" then its technically null and no value is being returned so the scanner will continue to look until an input is recieved whatever it may be.

        // Put your answer for #22H here:
        //It will store the value 645.0 and convert an int to a double

        // Put your answer for #22 here:
        // ^answers to 22 above?^

        // Put your answer for #24 here:
        // public class SumNumbers {
        //     public static void main(String[] args) {
        //         Scanner userInput = new Scanner (System.in);
        //         System.out.println("What is the low number of the sum?");
        //         int low = userInput.nextInt();
        //         System.out.println("What will be the highest number of sum?");
        //         int high = userInput.nextInt();
        //         int sum = 0;

        //         for (int i = low; i <= high; i++) {
        //             sum += i;
        //         }
        //         System.out.println ("sum ="+ sum);
        //     }
        // }



        // EXERCISES:

        // Put your answer for #5 here:
        // I built the method at the top of the java file so i could call it into my main method
        // Basically i built a nested for loop that the outer for loop takes care of how many rows, and the inner for loop takes care of columns.

        // UNIT TESTS:

        System.out.println("");
        System.out.println("Unit tests start here:");

        testPrintStringsHi3Times();
        testPrintStringsAbc5Times();
        testPrintStringsAbc10Times();

        testPrintGrid1x5();
        testPrintGrid4x5();
        testPrintGrid4x6();

    }

    // TEST METHODS:
    public static void testPrintStringsHi3Times() {
        System.out.println("START OF TEST: testPrintStringsHi3Times");
        printStrings("hi", 3);
        System.out.println("END OF TEST: testPrintStringsHi3Times");

        // Correct (expected) output:
        // hi hi hi
    }

    public static void testPrintStringsAbc5Times() {

        System.out.println("START OF TEST: testPrintStringsAbc5Times");
        printStrings("abc", 5);
        System.out.println("END OF TEST: testPrintStringsAbc5Times");

        // Correct (expected) output:
        // abc abc abc abc abc
    }

    public static void testPrintStringsAbc10Times() {
        System.out.println("START OF TEST: testPrintStringsAbc10Times");
        printStrings("abc", 10);
        System.out.println("END OF TEST: testPrintGrid4x5");

        // Correct (expected) output:
        // abc abc abc abc abc abc abc abc abc abc
    }

    public static void testPrintGrid1x5() {
        System.out.println("START OF TEST: testPrintGrid1x5");
        printGrid(1, 5);
        System.out.println("END OF TEST: testPrintGrid1x5");

        // Correct (expected) output:
        // 1 2 3 4 5
    }

    public static void testPrintGrid4x5() {
        System.out.println("START OF TEST: testPrintGrid4x5");
        printGrid(4, 5);
        System.out.println("END OF TEST: testPrintGrid4x5");

        // Correct (expected) output:
        // 1 5 9 13 17
        // 2 6 10 14 18
        // 3 7 11 15 19
        // 4 8 12 16 20
    }

    public static void testPrintGrid4x6() {
        System.out.println("START OF TEST: testPrintGrid4x6");
        printGrid(4, 6);
        System.out.println("END OF TEST: testPrintGrid4x6");

        // Correct (expected) output:
        // 1 5 9 13 17 21
        // 2 6 10 14 18 22
        // 3 7 11 15 19 23
        // 4 8 12 16 20 24
    }
}
