import java.util.*;
public class AssignedAsciiArt {

    public static void needleCore(int size){
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

    public static void needleRoofCap(int size){
        int layer = 0;
        for(int i=0; i < size; i++){
            for(int j=0; j < size*4; j++){
                if(j==0 || j == size*3){
                    //If beginning or end of roofcap build
                    for(int k=0; k < (size*2) - (layer*3); k++){
                        /*Size:3
                        first k up to 6 spaces created
                        second k up to 3
                        third k 0
                        */
                        System.out.print(" ");
                    }
                } else if(j == size*2){
                    //if not beginning or end, build the structure.
                    System.out.print("__/");
                    if(layer > 0){
                        //If size is greater than 1 ,pad with colons before fnishing the roofCap
                        for(int k=0; k < layer; k++){
                            System.out.print(":::");
                        }
                    }

                    System.out.print("||");
                    //Handle reverse of top half of method
                    if(layer > 0){
                        for(int k=0; k < layer; k++){
                            System.out.print(":::");
                        }
                    }
                    System.out.print("\\__");
                }
            }
            System.out.println("");
            layer++;
            //Increase in layer to handle varying sizes
        }
    }
    public static void needleBridge(int size){
        for(int i=1; i < size*7; i++){
            if( i==1 || i == size*7-1){
                System.out.print("|");
            }else{
                System.out.print("\"");
            }
        }
        System.out.println("");
    }

    public static void needleUnderCap(int size){
        int layer = size;
        for(int i=0; i < size; i++){
            for(int j=0; j < size*layer; j++){
                if(j==0 || j == size*layer-1){
                    //If beginning or end of UnderCap build on more the second layer or more
                    for(int k=0; k < (size-layer)*2 ; k++){
                        /*Size:3
                        Layer 1 should have 0 spaces created
                        Layer 2 should be 2 spaces
                        Layer 3 should be 4 spaces
                        */
                        System.out.print(" ");
                    }
                } else{
                    System.out.print("\\_/");
                    for(int l=0; l < (size*layer)-(1*(layer-1)) ; l++){
                        /*
                        Size 3
                        Layer 1 build 7
                        Layer 2 build 5
                        Layer 3 build 3(size)
                        */
                        System.out.print("\\/");
                        j++;
                    }
                    System.out.print("\\_/");
                }
            }
            System.out.println("");
            layer--;
        }
    }

    public static void needleElevator(int size){
        for(int i=0; i < size*size ; i++){
            for(int j=0; j < (size * 6)-2; j++){


                if(j == size * 3){
                    System.out.print("||");
                }else if(j > (size*2)+1 && j < (size*4)-1){
                    System.out.print("%");
                }else if(j==(size*2)+1 || j == (size*4)-1){
                    System.out.print("|");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static int gatherSize(Scanner input, int size){
        System.out.print("What size space needle would you like to see? ");
        size = input.nextInt();
        return size;
    }

    public static void main(String[] args){
        int size = 0;
        Scanner input = new Scanner(System.in);
        size = gatherSize(input, size);
        needleCore(size);
        needleRoofCap(size);
        needleBridge(size);
        needleUnderCap(size);
        needleCore(size);
        needleElevator(size);
        needleRoofCap(size);
        needleBridge(size);
    }
}
