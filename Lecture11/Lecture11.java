/*
Lecture11 for CS142
By: William Mentzer
*/

public class Lecture11 {

    public static double arrayAverage(int[] arr){
        double averageTotal = 0.00;
        for(int i = 0; i < arr.length; i++){
            averageTotal += arr[i];
        }
        averageTotal = averageTotal / arr.length;

        return averageTotal;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello, world!");
        //

        // SELF-CHECK PROBLEMS:
        // Put your answer for #2A here:
        // numbers[0]

        // Put your answer for #2B here:
        // numbers[9]

        // Put your answer for #2C here:
        // numbers[numbers.length - 1]
        // length will show length of 10 if it has 10 indexes but since inde starts at 0 you need to sutract 1 to access its final index

        // Put your answer for #3 here:
        int[] data = {27, 51, 33, -1, 101};
        System.out.println(data[0]);

        // Put your answer for #5 here:
        // {0,1,11,0,44,0,0,2}

        // Put your answer for #11 here:
        int[] data2 = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.println(arrayAverage(data2));

        // EXERCISES:
        // None for this lecture
    }
}
