
import java.io.*;
import java.util.*;

//This is Assignment3 by William Mentzer
//For CS-142
//"The golden goose is on the loose, and never out of season"

public class Sum {

    public static int[] numSplit(int numsInLine, int arrLength, String numToParse) {
        //this takes in a string and converts the string into an int array by looking at each individual char and then separating each digit into its own index starting at the end of the array and working backwards
        int[] transposedArray = new int[arrLength];
        int textInLength = numToParse.length();

        for (int i = 24; i > 24 - numToParse.length(); i--) {
            transposedArray[i] = Character.getNumericValue(numToParse.charAt(textInLength - 1));
            textInLength--;
        }

        return transposedArray;
    }

    public static String[] takeInText(Scanner textInput) {
        //Takes in a scanner, this takes one line, then splits it into an array of strings, removing any unnessecary spaces past the first, then splits what should be the numbers into separate string indexes in the array
        String textInBeforeInt = textInput.nextLine();
        textInBeforeInt = textInBeforeInt.replaceAll("\\s+", " ");
        String[] splitNums = textInBeforeInt.split(" ");
        return splitNums;

    }

    public static int[] initialzeTotalArray(int arrLength) {
        //This returns a blank array to reset numTotal, takes in arrLength to decide the length of the array
        int[] initialArray = new int[arrLength];
        for (int i = 0; i < initialArray.length; i++) {
            initialArray[i] = 0;
        }
        return initialArray;
    }

    public static void add(int[] numTotal, int[] numToAdd) {
        /*
        Takes in 2 arrays, num total and num to add
        This will go down each index backwards and add up all indexes
        if the inded i over the value of 10, modulo 10 and set the index to the new value and make carryOver true
        If carry over is true then before the modulo operation, it will add 1 to the index post addition
        */
        Boolean carryOver = false;
        for (int i = 0; i < numTotal.length; i++) {
            numTotal[24 - i] = numTotal[24 - i] + numToAdd[24 - i];
            if (carryOver) {
                numTotal[24 - i]++;
                carryOver = false;
            }
            if (numTotal[24 - i] >= 10) {
                numTotal[24 - i] = numTotal[24 - i] % 10;
                carryOver = true;
            }
        }
    }

    public static void printNums(int[] numTotal, int[] numToAdd, int totalNums, int arrLength) {
        /*
        Takes in the two arrays total and number to add as well as the number of total nums there is and the max length of the array.
        If the number of total nums left to print is > 0, it will print the numToAdd, else it will print numTotal if total nums == 0 by adding each array value to a compounding string
        In both methods, in order to get rid of unnessecary 0s , the int numMaxIndex is created to check when the number beins, which is where the print will begin for the chosen array
        if the numMaxIndex is the same as arrLength, then the number in question is 0 and both numTotal and numToAdd arent used and a 0 will be the decided string
        */
        String totalAdd = "";

        int numMaxIndex = 0;

        if (totalNums >= -1) {
            for (int i = 0; i < numTotal.length; i++) {
                if (numToAdd[i] == 0) {
                    numMaxIndex++;
                } else {
                    i = numTotal.length;
                }
            }

            if (numMaxIndex == arrLength) {
                totalAdd += Integer.toString(0);
            } else {
                for (int i = numMaxIndex; i < numToAdd.length; i++) {
                    totalAdd += Integer.toString(numToAdd[i]);
                }
            }
            System.out.print(totalAdd);
            totalAdd = "";
            numMaxIndex = 0;
            if (totalNums > 0) {
                System.out.print(" + ");
            }
        }
        if (totalNums == 0) {
            System.out.print(" = ");

            for (int i = 0; i < numTotal.length; i++) {
                if (numTotal[i] == 0) {
                    numMaxIndex++;
                } else {
                    i = numTotal.length;
                }
            }

            if (numMaxIndex == arrLength) {
                totalAdd += Integer.toString(0);
            } else {
                for (int i = numMaxIndex; i < numToAdd.length; i++) {
                    totalAdd += Integer.toString(numTotal[i]);
                }
            }
            System.out.println(totalAdd);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        int arrayLength = 25;
        int totalLines = 0;
        int[] numToAdd;
        int[] numTotal;
        Scanner textInput = new Scanner(new File("sum.txt"));

        while (textInput.hasNextLine()) {
            String[] lineNums = takeInText(textInput);
            int totalNums = lineNums.length - 1;
            numTotal = initialzeTotalArray(arrayLength);
            for (String currentNum : lineNums) {
                numToAdd = numSplit(totalLines, arrayLength, currentNum);
                add(numTotal, numToAdd);
                printNums(numTotal, numToAdd, totalNums, arrayLength);
                totalNums--;
            }
            totalLines++;
        }
        System.out.println();
        System.out.println("Total Lines: " + totalLines);
    }
}
