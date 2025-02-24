import java.io.*;
import java.util.*;

public class practiceMidterm {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("reservations.txt"));
        int reservCount = 0;
        int totalBodyCount = 0;
        while(input.hasNextLine()){
            reservCount += 1;
            input.next();
            totalBodyCount += input.nextInt();
        }
        System.out.printf("%d reservations \n", reservCount);
        System.out.printf("Total number of people coming to the restaurant: %d \n", totalBodyCount);

        int a = 3;
        double b = 4.0;

        System.out.println(a/b);
    }
}
