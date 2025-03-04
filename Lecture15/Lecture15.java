//Lecture 15 by William Mentzer for CS142

public class Lecture15 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

    // Put your answer for #18 here:
    //Trying to initialize a variable in the constructor will not initialize it into the class itself. Scope is the issue here.

    // Put your answer for #19 here:
    Name name1 = new Name("Bruce", "E.", "Paul");
    // Put your answer for #20 here:
    //1. return that specific object
    //2. invoke its own class methods Ex. this.getReverseOrder
    //3. pass as an argument from the class this.firstname;

    // Put your answer for #21 here:
    Point p1 = new Point(2, 5);
    Point p2 = new Point(p1);

    // Put your answer for #23 here:
    //Public means that other classes can access that piece of memory outside of the class itself. ex. Main can call up x in point and modify it outside of the class. If it were private on the other hand that x variable stays in the class, doesnt come out.

    // Put your answer for #24 here:
    //Modify it with a method inside its own class, then proceed to modify it from inside its own class. Also if you need to pull out the variable write a method to return that value. Allow the other classes to access it via methods.

    // Put your answer for #25 here:
    p1.newX(3);
    p1.newY(4);

    // Put your answer for #26 here:
    name1.currentFirstName();
    name1.currentLastName();
    name1.currentMiddleInitial();

    // Put your answer for #27 here:
    name1.newFirstName("Eddie");
    name1.newMiddleInitial("I");
    name1.newLastName("Maiden");

    // Put your answer for #28 here:
    // Restricting data so that the main method will allow for more deliberate control and not have oopsies where you modify wrong values when dealing with lots of different classes at once.

    // EXERCISES:

    // Put your answer for #11 here:
    // You will need to add the method in BankAccount.java,
    // and then create objects here to use (test) them

    BankAccount account1 = new BankAccount();
    account1.name = "Zed lepplin";
    account1.deposit(4904567.10);

    BankAccount account2 = new BankAccount();
    account2.name = "Han Valen";
    account2.deposit(32.50);

    account1.withdraw(500.00);
    account2.withdraw(32.00);

    // Put your answer for #12 here:

    System.out.println(account1.toString());

    // Put your answer for #13 here:
    account1.transfer(account2, 500);
    System.out.println(account2.toString());
  }
}

class Point {
  private int x;
  private int y;

  // Constructs a new point at (0, 0).
  public Point() {
    x = 0;
    y = 0;
  }

  // Constructs a Point at the given x/y location.
  public Point(int initialX, int initialY) {
    x = initialX;
    y = initialY;
  }

  public Point(Point pInit){
    x = pInit.x;
    y = pInit.y;
  }

  // A "read-only" access to the x field ("accessor")
  public int getX() {
    return x;
  }

  // Allows clients to change the x field ("mutator")
  public void newX(int newX) {
    x = newX;
  }

  public void newY(int newY) {
    x = newY;
  }

  public void setLocation(int newX, int newY) {
    x = newX;
    y = newY;
  }

  public void translate(int dx, int dy) {
    x = x + dx;
    y = y + dy;
  }

  // alternative solution that utilizes setLocation
  //   public void translate(int dx, int dy) {
  //     setLocation(x + dx, y + dy);
  //   }

  public double distance(Point other) {
    int dx = x - other.x;
    int dy = y - other.y;
    return Math.sqrt(dx * dx + dy * dy);
  }

  public double distanceFromOrigin() {
    return Math.sqrt(x * x + y * y);
  }

  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}
