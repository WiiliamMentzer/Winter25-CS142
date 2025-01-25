import java.util.*;
/*
Freeform Ascii Art By William Mentzer
For: CS-142 Intermediate Programming

Purpose: To create a creeper face using the " " and * in output, letting the user increase its size based on user input
*/
public class FreeFormAsciiArt {

    public static void creepFill(int size){
        for(int c = 0; c < size * 2; c++){
            System.out.print("*");
        }
    }

    public static void creepEmpty(int size){
        for(int c = 0; c < size * 2; c++){
            System.out.print(" ");
        }
    }

    public static void main(String[] args){
        int [][] blueprintCreeper = {
        {0,0,0,0,0,0,0,0},
        {0,1,1,0,0,1,1,0},
        {0,1,1,0,0,1,1,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,1,1,0,0,0},
        {0,0,1,1,1,1,0,0},
        {0,0,1,0,0,1,0,0},
        {0,0,0,0,0,0,0,0},
        };

        Scanner input = new Scanner(System.in);
        System.out.println("How wide do you want the creeper face to be?");

        int size = 1;
        size = input.nextInt();

        //This nested for loop looks parses through every index in the array and looks for a binary 0 or 1 whether it should or should not create an empty " " sector
        for(int i=0; i < blueprintCreeper.length; i++){
            for(int j=0; j < blueprintCreeper[i].length; j++){
                if (blueprintCreeper[i][j] == 1){
                    creepEmpty(size);
                } else {
                    creepFill(size);
                }
            }
            System.out.println("");
        }
    }

}
