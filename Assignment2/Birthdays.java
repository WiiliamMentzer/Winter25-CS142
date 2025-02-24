import java.util.Scanner;
import java.util.*;

//Birthdays by William Mentzer
//For CS-142

public class Birthdays {

    /*
    This will acquire the users's birthdays and todays date.
    Takes in a scanner, nabs the info and shoots it into an array.
    Then uses the same initialized array to convert the second to last index (index 4 is used later in birthdayProcessing) to the absolute day version (1-366)
    Then back into main where birthday values and current date arrays are stored.
    */
    public static int[] userInputMonthDay(Scanner in, boolean todayCheck) {
        int[] date = new int[4];
        date[0] = in.nextInt();
        date[1] = in.nextInt();
        date[2] = absoluteDayConverter(date);

        return date;
    }

    /*
    Converts array values into absolute value stored in the second last index of the array via cumunulative addition, check what months it is and how many days are in each.
    Then back into userInputMonthDay.
    */
    public static int absoluteDayConverter(int[] monthDay) {
        int absoluteDay = 0;
        for(int i=1; i <= monthDay[0]; i++) {
            if(i == monthDay[0]) {
                absoluteDay += monthDay[1];
            } else if (i==2 && !(monthDay[0] > i)) {
                absoluteDay += monthDay[1];
            } else if ((i==4 || i==6 || i==9 || i== 11) && monthDay[0] > i) {
                absoluteDay += 30;
            } else if ( i==2 && monthDay[0] > i) {
                absoluteDay += 29;
            } else {
                absoluteDay += 31;
            }
        }
        return absoluteDay;
    }

    /*
    This processes most of the information needed about ones birthday.
    Initially checks how many days away until the birthday.
    creates a new value percetnAway that is used and stored later in the last index of []bday
    Then displays what day it is, what day it falls on of the year, and how many days until the next birthday
    finally it shows the percentage of a year until its the birthday and stores the percent away in the last index using whole numbers so it circumvents the issue of lossy double storage in the conversion.
    */
    public static void birthdayInfoDump(int[] bday, int[] currentDate){
        int daysAway = ((366-currentDate[2]) - (366-bday[2]) + 366) % 366;

        double percentAway = (daysAway/366.0) * 100;

        System.out.printf("%d/%d/2020 falls on day #%d of 366.\n", bday[0], bday[1], bday[2]);

        if (percentAway == 0) {
            System.out.println("Happy birthday!");
        } else {
            System.out.printf("Your next birthday is in %d day(s).\n", daysAway);
            System.out.printf("That is %.1f percent of a year away.\n", percentAway);
        }

        bday[3] = (int)(percentAway * 100);
    }

    /*
    This takes in 2 bdays arrays
    will check which value of the last index is bigger and will look for the lesser of the two as to which birthday is closer.
    */
    public static void birthdayClosenessDecider(int[] bday1, int[] bday2){
        if (bday1[3] == bday2[3]) {
            System.out.println("\nWow, you share the same birthday!\n");
        } else if(bday1[3] < bday2[3]) {
            System.out.println("\n Person 1's birthday is sooner. \n");
        } else {
            System.out.println("\n Person 2's birthday is sooner. \n");
        }

    }

    /*
    This will just check if the user wants to repeat the program since its an infinite loop.
    */
    public static boolean repeatDecider( Scanner in){
        System.out.println("Would you like to compare two more birthdays?");
        System.out.println("Type 1 and then <enter/return> to compare two more birthdays");
        System.out.println("Type 2<enter/return> to end the program");
        int userDecides = in.nextInt();
        if (userDecides == 1){
            return true;
        } else {
            return false;
        }
    }


    //This will show you how awesome my birthday fun fact is.
    public static void birthdayFunFact(){
        System.out.println("April 8th is National All Is Ours Day!");
        System.out.println("Face up, make your stand");
        System.out.println("And realise you're living in the golden years!");
    }


    public static void main(String[] args) {
        Boolean repeat = true;
        do {
            Scanner input = new Scanner(System.in);

            System.out.println("This program compares two birthdays");
            System.out.println("and displays which one is sooner.");

            System.out.println("What is today's month and day?"); // 10 17
            int[] todaysDate = userInputMonthDay(input, true);
            System.out.printf("Today is %d/%d/2020, day #%d of the year.\n", todaysDate[0], todaysDate[1], todaysDate[2]);
            // System.out.println("Today is //2020, day # of the year.");

            System.out.println("Person 1:");
            System.out.print("What month and day were you born? "); // 10 17
            int[] person1Bday = userInputMonthDay(input, false);
            birthdayInfoDump(person1Bday, todaysDate);

            // 10/17/2020 falls on day #291 of 366.
            // Your next birthday is in 262 day(s).
            // That is 71.6 percent of a year away.

            System.out.println("Person 2:");
            System.out.print("What month and day were you born? "); // 10 17
            int[] person2Bday = userInputMonthDay(input, false);
            birthdayInfoDump(person2Bday, todaysDate);

            birthdayClosenessDecider(person1Bday, person2Bday);

            birthdayFunFact();

            repeat = repeatDecider(input);

            if(repeat){
                System.out.println();
            }
        }while(repeat);
    }
}
