import java.io.*;    // for File
import java.util.*;  // for Scanner

public class AverageTemperaturePerLine {
   public static void main(String[] args)
            throws FileNotFoundException {
            
      Scanner input = new Scanner(new File("weather.txt"));
        
      while(input.hasNextLine() ) {
         String theLine = input.nextLine(); // could combine this into the next line
         System.out.println("The next line is: " + theLine);
         
         Scanner lineScanner = new Scanner( theLine );
        
         double total = 0;
         int howMany = 0; 
         while( lineScanner.hasNextDouble() ) {
            double nextNum = lineScanner.nextDouble();
            total += nextNum;
            howMany++;
         }
         
         if( howMany > 0 ) {
            System.out.printf("\tThe average is: %.2f\n", total / howMany);
         } else {
            System.out.println("\tThere are no numbers on this line");
         }
      }
   }
}
