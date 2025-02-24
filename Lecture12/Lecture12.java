/*
Lecture12 for CS142
By: William Mentzer
*/
import java.util.Arrays;

public class Lecture12 {

    public static void reverseArrayPrinting(int[] arr){
        for(int i = arr.length; i > 0; i--){
            System.out.println(arr[i-1]);
        }
    }

    public static boolean allLess(int[] arr1, int[] arr2){
        boolean less = true;
        if(arr1.length != arr2.length){
            less = false;
        }
        int lengthIndex = arr1.length;
        do{
            lengthIndex--;
            if(arr1[lengthIndex] != arr2[lengthIndex]){
                less = false;
            }
        }while(less && lengthIndex > 0);

        return less;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello, world!");
        //

        // SELF-CHECK PROBLEMS:
        // Put your answer for #14 here:
        // [3, 24, 8, -5, 6, 1]

        // Put your answer for #15 here:
        int[] listNums = {1, 44, 72, -5, -34, 10, -47};
        reverseArrayPrinting(listNums);

        // Put your answer for #17 here:
        int[] listNums2 = {1, 44, 72, -34, 10, -47};
        int[] listNums3 = {1, 44, 72, -5, -34, 10, -47};

        System.out.println(allLess(listNums2, listNums3));

        // EXERCISES:

        // Put your answer for #1 here:

        // Put your answer for #3 here:

        // Put your answer for #4 here:
    }
}
