
// These questions are also listed in the Canvas Assignment 
// and if there's any disagreement between them then the versions on Canvas 
// will take precendence over the ones here.
// That said, it will (hopefully) it will (hopefully) be
// useful to have them here, too

//ICE19 by William Mentzer
//For CS-142
//Have a great spring break, see you in Data Sturctures

public class Lecture19Recursion {
    public static void main(String[] args) {
        System.out.println("printNumsRecursively_1(1,5) ====================");
        printNumsRecursively_1(1, 5);

        System.out.println("printNumsRecursively_2(1,5) =========");
        printNumsRecursively_2(1, 5);

        System.out.println("printNumsRecursively_3(1,5) ====================");
        printNumsRecursively_3(1, 5);
    }

    public static void printNumsRecursively_1(int low, int high) {
        if (low <= high) {
            System.out.println(low);
            printNumsRecursively_1(low + 1, high);
        }
    }

    public static void printNumsRecursively_2(int low, int high) {
        if (low <= high) {
            printNumsRecursively_2(low + 1, high);
            System.out.println(low);
        }
    }

    public static void printNumsRecursively_3(int low, int high) {
        System.out.println(low);
        if (low <= high) {
            printNumsRecursively_3(low + 1, high);
        }
        System.out.println(low);
    }

    /*
    1.
        Output:
            1
            2
            3
            4
            5

        Why:
            if the low is less than or equal to high
                first print the low
                then recursively call the method

            this will print 1 out of the gate and then climb to 5 and finish the calls.

            if 1<=5 { TRUE
                print   1
                if 2<=5 { TRUE
                    print 2
                    if 3<=5 { TRUE
                        print 3
                        if 4<=5 { TRUE
                            print 4
                            if 5<=5 { True
                                print 5
                                if 6<=5{ FALSE
                                }
                            }
                        }
                    }
                }
            }

    2.
        Output:
            5
            4
            3
            2
            1
        
        Why:
            if low is less than or equal to high
                recursively call the method with a +1 low
                then print the low
            
            this will start at 5 and then work its way down the chain

            
            if 1<=5 { TRUE
                if 2<=5 { TRUE
                    if 3<=5 { TRUE
                        if 4<=5 { TRUE
                            if 5<=5 { True
                                if 6<=5{ FALSE
                                }
                                print 5
                            }
                            print4
                        }
                        print3
                    }
                    print 2
                }
                print 1
            }

    3.
        Output:
            1
            2
            3
            4
            5
            6
            6
            5
            4
            3
            2
            1
        
        Why:
            print the low first
            then if low is less than or equal to high run recursion with +1
                print the low first
                    if low less than or = 5 recursively call method
                print the low again
            print the low again
    */
}