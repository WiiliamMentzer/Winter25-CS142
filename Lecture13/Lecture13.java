/*
Lecture13 for CS142
By: William Mentzer
*/

import java.util.Arrays;

public class Lecture13 {

  public static int kthLargest(int k, int[] a){
    Arrays.sort(a);
    if (a.length == 1){
      k = a[0];
    } else {
      k = a[a.length-(k+1)];
    }
    return k;
  }

  public static boolean isUnique(int[] arr){
    Boolean isItUnique = true;
    for (int i=0; i < arr.length; i++) {
      int currentNum = arr[i];
      for(int j = 0; j < arr.length; j++){
        if (j != i && currentNum == arr[j]){
          isItUnique = false;
        }
      }
    }
    return isItUnique;
  }

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

    // Put your answer for #22 here:
    //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    // Put your answer for #23 here:
    //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

    // Put your answer for #28A here:
    //Nothing will happen
    //{8} will stay at {8}

    // Put your answer for #28B here:
    //{14, 8}

    // Put your answer for #28C here:
    //{7, 2, 3, 3, 1, 4}

    // Put your answer for #28D here:
    //{10, 9, 9, 6, 6}

    // Put your answer for #28E here:
    //{12, 12, 11, 11, 9, 8}

    // EXERCISES:

    // Put your answer for #7 here:
    int[] nums = {74, 85, 102, 99, 101, 56, 84};
    System.out.println(kthLargest(2, nums));
    // You will need to add the method above main(), but then call it here

    // Put your answer for #11 here:
    int[] nums2 = {3, 8, 12, 2, 9, 17, 43, -8, 46 };
    System.out.println(isUnique(nums2));
    int[] nums3 = {4, 7, 3, 9, 12, - 47, 3, 74};
    System.out.println(isUnique(nums3));
  }
}
