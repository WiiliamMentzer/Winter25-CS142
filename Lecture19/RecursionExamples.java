import java.util.Scanner;
public class RecursionExamples {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("printNums(1,3) ====================");
      printNums(1, 3);
      
      System.out.println("printNumsRecursively(1,3) =========");
      printNumsRecursively(1,3);
      
      System.out.println("printNumsOneLine(1,3) ====================");
      printNumsOneLine(1, 3);
      
      System.out.println("printNumsOneLineRecursively(1,3) =========");
      printNumsOneLineRecursively(1,3);
   }      
  
   // printing the numbers, one number per line: 
   public static void printNums(int low, int high) {
      while(low <= high) {
         System.out.println(low);
         low++;
      }
   }
   
   public static void printNumsRecursively(int low, int high) {
      if(low <= high) {
         System.out.println(low);
         printNumsRecursively(low+1, high);
      }
   }
   
   // printing the numbers, all on one line:
   // We also check the parameters to make sure they work
   public static void printNumsOneLine(int low, int high) {
      if( low > high) {
         System.out.println("low must be lower than high"); // or throw an exception, etc
         return;
      }
   
      while(low <= high) {
         System.out.print(low);
         if(low < high) System.out.print(" ");
         
         low++;
      }
      System.out.println();
   }
   
   // Printing the numbers on one line
   // Note that we've split this recursive method into a private, recursive method
   // And a public method that will do any work that happens before or after the recursion
   public static void printNumsOneLineRecursively(int low, int high) {
      if( low > high) {
         System.out.println("low must be lower than high"); // or throw an exception, etc
         return;
      }
   
      printNumsOneLineRecInternal(low, high);
   
      System.out.println();
   }
   
   private static void printNumsOneLineRecInternal(int low, int high) {
      if(low <= high) {
         System.out.print(low);
         if(low < high) System.out.print(" ");
         
         printNumsOneLineRecInternal(low+1, high);
      }
   }
}