public class Lecture17 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello, world!");
        // SELF-CHECK PROBLEMS:
        // Note: you will need to put some of your answers inside a comments

        // Put your answer for #10 here:
        /*
            a b c d
            A and B means that a vehicle can be a car and an SUV because its apart of the daisy chain of extende
            C is a car that can be an SUV because a car can be an SUV since SUV extends car
            D is an SUV being an SUV so it needs not extend from anything.
            E and F have this issue where the object is trying to become something it extends, which it cannot. 
        */

        // Put your answer for #12 here:
        /*
        ---(element at play), else it output
        ---element[0] = Shoe
        flute        
        shoe 1       
        flute 2
        
        ---element[1] = Flute
        flute        
        blue 1 

        ---element[2] = Moo
        moo 1
        moo 2

        ---element[3] = Blue
        moo
        blue 1
        moo 2
        */
        // Put your answer for #13 here:
        /*
        ---(element at play), else it output
        ---element[0] = Blue
        moo 2
        blue 1
        moo
                
        ---element[1] = Moo
        moo 2
        moo 1
        moo

        ---element[2] = Shoe
        flute 2
        shoe 1
        flute

        ---element[3] = Flute
        flute 2
        blue 1
        flute
        */

        // Put your answer for #18 here:
        // An is-a relationship is saying that an object is a type of object, so for instance an SUV is-a extension of Car.
        // A has-a relationship is when an object has-an object inside of it. So a GroceryItemOrder has-a GroceryItem inside of it.

        // Put your answer for #19 here:
        //Since a rectangle and square have the same formulas for area and perimiter, technically you can extend the rectangle to add square. This would cut down on reused code.

        // Put your answer for #20 here:
        //No 52 subclasses wouldnt be good, reason being is that when dealing with lots of subclasses like this an implement would be better.
        //Since there are many combinations fo playing cards it would be easier to just promise to implement the methods needed isntead of overwriting and overloading each different extension.

        // EXERCISES:

        // NOTE: Your program must compile and run,
        // and the code for all your exercises should be left UNcommented in the file.
        // In order to do that you should put any new classes that you create OUTSIDE
        // of main() even though there may be comments in main() saying to "Put your
        // answer for #5 here".
        // Instead, put code that tests / tries out / uses your classes in main(),
        // and keep the class definitions themselves outside of main().

        // Put your answer for #5
        // I.e., create a Ticket object, try calling the methods and printing out the
        // results, etc, etc

        // Put your answer for #6

        // Put your answer for #7

        // Put your answer for #8

        // Put your answer for #14
    }
}

// Put your class definitions here
// NOTE: Do NOT mark them public

class Ticket { // Note that there's no 'public'!
    int number = 1;

    public Ticket(){
        number++;
    }

    public double getPrice(){
        return 50.00;
    }

    public String toString(){
        return "Number: " + number + ", Price: " + Double.toString(this.getPrice());
    }
    // definition goes here

}

class WalkupTicket extends Ticket {
    public WalkupTicket() {           
    }
}

class AdvanceTicket extends Ticket {
    int daysBefore = 0;
    public AdvanceTicket(int daysBefore) {
        this.daysBefore = daysBefore;
    }
    
    public double getPrice(int daysBefore){
        if (daysBefore > 10) {
            return 30.00;
        } else {
            return 40.00;
        }
    }
}

class StudentAdvanceTicket extends AdvanceTicket {
    public StudentAdvanceTicket(int daysBefore){
        super(daysBefore);
    }
    
    public double getPrice(int daysBefore){
        return super.getPrice(daysBefore) / 2;
    }

    public String toString(){
        return "Number: " + this.number + ", Price: " + Double.toString(this.getPrice()) + " (ID required)";
    }
}
