import java.util.*;
public class AssignedAsciiArt {

    public static void needleCore(int size) {
        for(int i=0; i < size ; i++){
            for(int j=0; j < size * 6; j++){
                if(j == size * 3){
                    System.out.print("||");
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

 public static void needleHat(int size) {
        int spacesNeeded = 3 * size;
        for(int i=0; i < spacesNeeded-3; i++) {
            System.out.print(" ");
        }
        System.out.println("__/||\\__");
    }


    public static void needleRoofCap(int size) {
        for(int i=0; i < size-1; i++) {
            int spacesNeeded = 3 * (size-(i+2));
            int numberOfColonPadding = 3 * (i+1);

            for(int j=0; j < spacesNeeded; j++) {
                System.out.print(" ");
            }

            System.out.print("__/");
            for(int j=0; j < numberOfColonPadding; j++) {
                System.out.print(":");
            }

            System.out.print("||");

            for(int j=0; j < numberOfColonPadding; j++) {
                System.out.print(":");
            }

            System.out.println("\\__");
        }
    }

    public static void needleBridge(int size) {
        int quoteSetsNeeded = size*6;
        System.out.print("|");
        for(int i = 0; i < quoteSetsNeeded; i++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }

   
    public static void needleUnderCap(int size) {
        for(int i=0; i < size; i++) {
            int spacedNeeded = i*2;
            int arrowsNeeded =  size + ((size - (i+1)) * 2);

            for (int j = 0; j < spacedNeeded; j++) {
                System.out.print(" ");
            }

            System.out.print("\\_/");

            for (int j=0; j < arrowsNeeded; j++) {
                System.out.print("\\/");
            }
            
            System.out.println("\\_/");
        }
    }

    public static void needleElevator(int size) {
        for(int i=0; i < size*size ; i++) {
            for(int j=0; j < (size * 6)-2; j++) {


                if(j == size * 3){
                    System.out.print("||");
                }else if(j > (size*2)+1 && j < (size*4)-1) {
                    System.out.print("%");
                }else if(j==(size*2)+1 || j == (size*4)-1) {
                    System.out.print("|");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static int gatherSize(Scanner input, int size) {
        System.out.print("What size space needle would you like to see? ");
        size = input.nextInt();
        return size;
    }

    public static void main(String[] args) {
        int size = 0;
        Scanner input = new Scanner(System.in);
        size = gatherSize(input, size);
        needleCore(size);
        needleHat(size);
        needleRoofCap(size);
        needleBridge(size);
        needleUnderCap(size);
        needleCore(size);
        needleElevator(size);
        needleHat(size);
        needleRoofCap(size);
        needleBridge(size);
    }
}
