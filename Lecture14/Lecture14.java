public class Lecture14 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

    // Put your answer for #1 here:

    // Put your answer for #2 here:

    // Put your answer for #3 here:

    // Put your answer for #5 here:

    // Put your answer for #8 here:

    // Put your answer for #7 here:

    // Put your answer for #11 here:
    Name name1 = new Name();
    name1.firstName = "John";
    name1.middleInitial = "P.";
    name1.lastName = "Doe";

    System.out.println(name1.getNormalOrder());
    System.out.println(name1.getReverseOrder());

    // Put your answer for #14 here:

    // Put your answer for #15 here:
    Point p1 = new Point();
    // Put your answer for #16 here:

    
    // EXERCISES:

    // Put your answer for #7 here:
    // You will need to add the method in Point.java,
    // and then create Point objects here to use (test) them


    // Put your answer for #8 here:
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

