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

    public static int countInRange(int[] arr, int min, int max){
        int totalElements = 0;
        for( int i=0; i < arr.length; i++) {
            if(arr[i] >= min && arr[i] <= max){
                totalElements++;
            }
        }
        return totalElements;
    }

    public static boolean isSorted(double[] arr){
        boolean sortedArray = true;
        for(int i=1; i < arr.length; i++) {
            if(arr.length > 1 && arr[i] < arr[i-1]){
                sortedArray = false;
            }
        }
        return sortedArray;
    }

    //-1 shouls return of last index of 
    public static int lastIndexOf(int[] arr, int val){
        int lastIndex = -1;

        for(int i=0; i < arr.length; i++) {
            if(arr[i] == val){
                lastIndex = i;
            }
        }

        return lastIndex;
    }

    //Checks to see if array does not equal each other.
    /*
    Note: im going to be so honest i just didnt read what the problem actually needed and i made this on accident that just checks if two arrays are the same.
    I just dont have the guts to delete it as i kinda like the solution i made.
    */
    public static boolean isSame(int[] arr1, int[] arr2){
        boolean less = true;
        //if the length is not equal false it.
        if(arr1.length != arr2.length) {
            less = false;
        }
        int lengthIndex = arr1.length;
        // subtract one from the index so it will run even on index of 1, then see if the first index does not equal each other, otherwise keep looping to check all indexes
        do{
            lengthIndex--;
            if(arr1[lengthIndex] != arr2[lengthIndex]) {
                less = false;
            }
        }while(less && lengthIndex > 0);

        return less;
    }

    //Checks to see if all the index's of arr1 (input 1) is less than arr2 (input 2).
    public static boolean allLess(int[] arr1, int[] arr2){
        boolean less = true;
        //if the length is not equal false it.
        if(arr1.length != arr2.length) {
            less = false;
        }
        int lengthIndex = arr1.length;
        // subtract one from the index so it will run even on index of 1, then see if the first index does not equal each other, otherwise keep looping to check all indexes
        do{
            lengthIndex--;
            if(arr1[lengthIndex] > arr2[lengthIndex]) {
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
        int[] listNums2 = {0, 43, 71, -6, -35, 9, -48};
        int[] listNums3 = {1, 44, 72, -5, -34, 10, -47};

        System.out.println("allLess here: " + allLess(listNums2, listNums3));

        // EXERCISES:

        // Put your answer for #1 here:
        int[] listNums4 = {74, 85, 102, 99, 101, 85, 56};
        System.out.println(lastIndexOf(listNums4, 85));
        // Put your answer for #3 here:
        int[] listNums5 = {14, 1, 22, 17, 36, 7, -43, 5};
        System.out.println(countInRange(listNums5, 4, 17));
        // Put your answer for #4 here:
        double[] listNums6 = {16.1, 12.3, 22.2, 14.4};
        double[] listNums7 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
        System.out.println(isSorted(listNums6));
        System.out.println(isSorted(listNums7));
    }
}
