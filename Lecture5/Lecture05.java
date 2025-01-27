
// Lecture 05
//Made by William Mentzer for CS-142

import java.util.Scanner;

public class Lecture05 {

    public static String season(int month, int day) {
        String setSeason = "Error";
        if(month >= 12 && day >= 16 || month <=3 && day <= 15){
            setSeason="winter";
        } else if(month >= 3 && day >= 15 || month <=6 && day <= 15){
            setSeason="spring";
        } else if(month >= 6 && day >= 16 || month <=9 && day <= 15){
            setSeason="summer";
        } else if(month >= 9 && day >= 16 || month <=12 && day <= 15){
            setSeason="fall";
        }
        return setSeason;
    }

    public static void test_printRange(int A, int B) {
        if( A > B){
            for(int i = A; i >= B; i--){
                System.out.print(i + " ");
            }
        } else{
            for(int i = A; i <= B; i++){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    public static void redundantFix(int x) {
        int a = 2;
        if (x < 30) {
            x++;
            System.out.println("Java is awesome!" + x );
        }
    }

    public static int sumTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void multiTogether() {
        Scanner input = new Scanner(System.in);
        int total = 1;
        int x = 1;
        while(x != -1) {
            System.out.println("Please input a number, -1 to exit");
            x = input.nextInt();
            if(x != -1){
                System.out.print(x + " * " + total + " = ");
                total *= x;
                System.out.println(total);
            }
        }
    }

    public static void reverseName(String s) {
        int nameDivide = 0;
        for(int i=0; i < s.length(); i++) {
            char space = ' ';
            if(space == s.charAt(i)){
                nameDivide = i + 1;
            }
        }
        for( int i = nameDivide; i < s.length(); i++ ) {
            System.out.print(s.charAt(i));
        }
        System.out.print(", " + s.charAt(0) + ".");

    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello, world!");
        // SELF-CHECK PROBLEMS:
        // Note: you will need to put some of your answers inside a comments

        // Put your answer for #5A here:
        //13 21

        // Put your answer for #5B here:
        //4 5

        // Put your answer for #5C here:
        //6 5

        // Put your answer for #5D here:
        //7 11

        // Put your answer for #8 here:
        // Instead of correcting the code write a brief explanation of how to fix it
        // and include only the lines that you'll change

        //Change on line 7. Move the else statement to the first if statement on line 10, the logic between checking if its even or odd is right but the print odd does NOT need to be apart of the modulo 3 check.

        // Put your answer for #10 here:
        // NOTE: You'll need to write the method on, say, line 2
        // (i.e., outside of this main() method)
        // and then call that method right here

        redundantFix(13);

        // Put your answer for #15 here:
        //The issue here is the scope of the variable num sum that is being created. return sum will create an error because outside of that for loop there is no variable named sum. Move that int sum = 0 to the top before the for loop and remove the creation of int sum in the for loop and everything should work now.

        // Put your answer for #16 here:
        // While we are returning a factor, there is 2 factors that are missing. 14 has 3 factors of 13, 7, and 2. So theoretically there should be 3 factors being returned (3- as in number of factors). What need sot happen is the initialization of int factorCount at the beginning and instead of return i, move the return to outside the for loop and return factorCount and add a factorCount++; in the if section in the for loop. 

        // Put your answer for #17 here:
        multiTogether();

        // Put your answer for #23 here:
        reverseName("Marla Singer");

        // UNIT TESTS:
        System.out.println("");
        System.out.println("Unit tests start here:");

        test_printRange2_7();
        test_printRange19_11();
        test_printRange5_5();

        testSeasonsWinter();
        testSeasonsSpring();
        testSeasonsSummer();
        testSeasonsFall();
    }

    // TEST METHODS:
    public static void test_printRange2_7() {

        System.out.println("START OF TEST: test_printRange2_7");
        test_printRange(2, 7);
        System.out.println("END OF TEST: test_printRange2_7");

        // Correct (expected) output:
        // 2 3 4 5 6 7
    }

    public static void test_printRange19_11() {

        System.out.println("START OF TEST: test_printRange19_11");
        test_printRange(19, 11);
        System.out.println("END OF TEST: test_printRange19_11");

        // Correct (expected) output:
        // 19 18 17 16 15 14 13 12 11
    }

    public static void test_printRange5_5() {
        System.out.println("START OF TEST: test_printRange5_5");
        test_printRange(5, 5);
        System.out.println("END OF TEST: test_printRange5_5");

        // Correct (expected) output:
        // 5
    }

    // This is NOT a test itself.
    // This method is used by other testing methods
    private static void testSeason(int month, int day, String expectedAnswer) {
        String outputFromPrintStringsMethod = season(month, day);

        System.out.println("For month=" + month + ", day=" + day + " your season method should return " + expectedAnswer
                + "; what your code actually returned is>" + outputFromPrintStringsMethod + "<");
    }

    public static void testSeasonsWinter() {

        System.out.println("START OF TEST: testSeasonsWinter");

        // If the date falls between 12/16 and 3/15, the method should return "winter".
        testSeason(12, 16, "winter");
        testSeason(12, 30, "winter");
        testSeason(12, 31, "winter");

        testSeason(1, 1, "winter");
        testSeason(1, 11, "winter");
        testSeason(1, 31, "winter");

        testSeason(2, 1, "winter");
        testSeason(2, 24, "winter");
        testSeason(2, 31, "winter");

        testSeason(3, 1, "winter");
        testSeason(3, 14, "winter");
        testSeason(3, 15, "winter");
        System.out.println("END OF TEST: testSeasonsWinter");

        // Correct (expected) output:
        // For month=12, day=16 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=12, day=30 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=12, day=31 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=1, day=1 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=1, day=11 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=1, day=31 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=2, day=1 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=2, day=24 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=2, day=31 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=3, day=1 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=3, day=14 your season method should return winter; what your code
        // actually returned is>winter<
        // For month=3, day=15 your season method should return winter; what your code
        // actually returned is>winter<
    }

    public static void testSeasonsSpring() {
        System.out.println("START OF TEST: testSeasonsSpring");

        // If the date falls between 3/16 and 6/15, the method should return "spring".
        testSeason(3, 16, "spring");
        testSeason(3, 30, "spring");
        testSeason(3, 31, "spring");

        testSeason(4, 1, "spring");
        testSeason(4, 11, "spring");
        testSeason(4, 31, "spring");

        testSeason(5, 1, "spring");
        testSeason(5, 24, "spring");
        testSeason(5, 31, "spring");

        testSeason(6, 1, "spring");
        testSeason(6, 14, "spring");
        testSeason(6, 15, "spring");
        System.out.println("END OF TEST: testSeasonsSpring");

        // Correct (expected) output:
        // For month=3, day=16 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=3, day=30 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=3, day=31 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=4, day=1 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=4, day=11 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=4, day=31 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=5, day=1 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=5, day=24 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=5, day=31 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=6, day=1 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=6, day=14 your season method should return spring; what your code
        // actually returned is>spring<
        // For month=6, day=15 your season method should return spring; what your code
        // actually returned is>spring<
    }

    public static void testSeasonsSummer() {
        System.out.println("START OF TEST: testSeasonsSummer");
        // If the date falls between 6/16 and 9/15, the method should return "summer".
        testSeason(6, 16, "summer");
        testSeason(6, 30, "summer");
        testSeason(6, 31, "summer");

        testSeason(7, 1, "summer");
        testSeason(7, 11, "summer");
        testSeason(7, 31, "summer");

        testSeason(8, 1, "summer");
        testSeason(8, 24, "summer");
        testSeason(8, 31, "summer");

        testSeason(9, 1, "summer");
        testSeason(9, 14, "summer");
        testSeason(9, 15, "summer");
        System.out.println("END OF TEST: testSeasonsSummer");

        // // Correct (expected) output:
        // For month=6, day=16 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=6, day=30 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=6, day=31 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=7, day=1 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=7, day=11 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=7, day=31 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=8, day=1 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=8, day=24 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=8, day=31 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=9, day=1 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=9, day=14 your season method should return summer; what your code
        // actually returned is>summer<
        // For month=9, day=15 your season method should return summer; what your code
        // actually returned is>summer<
    }

    public static void testSeasonsFall() {
        System.out.println("START OF TEST: testSeasonsFall");

        // If the date falls between 9/16 and 12/15, the method should return "fall".
        testSeason(9, 16, "fall");
        testSeason(9, 30, "fall");
        testSeason(9, 31, "fall");

        testSeason(10, 1, "fall");
        testSeason(10, 11, "fall");
        testSeason(10, 31, "fall");

        testSeason(11, 1, "fall");
        testSeason(11, 24, "fall");
        testSeason(11, 31, "fall");

        testSeason(12, 1, "fall");
        testSeason(12, 14, "fall");
        testSeason(12, 15, "fall");

        System.out.println("END OF TEST: testSeasonsFall");

        // Correct (expected) output:
        // For month=9, day=16 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=9, day=30 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=9, day=31 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=10, day=1 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=10, day=11 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=10, day=31 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=11, day=1 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=11, day=24 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=11, day=31 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=12, day=1 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=12, day=14 your season method should return fall; what your code
        // actually returned is>fall<
        // For month=12, day=15 your season method should return fall; what your code
        // actually returned is>fall< }
    }
}