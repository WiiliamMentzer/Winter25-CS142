import java.awt.*;
import java.util.Random;

public class Lecture18 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

    // Put your answer for #22 here:
    //Implementing you promise to add the said methods into the class, with an extension you just give the code forward.

    // Put your answer for #23 here:
    //Class c must have a m1 and m2 method for it to compile successfully.

    // Put your answer for #24 here:
    //? missing on page ?

    // Put your answer for #25 here:
    //See Line 35-37 and 44-54

    // Put your answer for #26 here:
    Circle circ = new Circle(12.0);
    Rectangle rect = new Rectangle(4, 7);
    Triangle tri = new Triangle(5, 12, 13);
    printInfo(circ);
    printInfo(tri);
    printInfo(rect);

    // EXERCISES:

    // Put your answer for #15 in this repo:
    Octagon octa = new Octagon(5);
    printInfo(octa);

    // Put your answer for #16 in this repo:
    Hexagon hexa = new Hexagon(7);
    printInfo(hexa);

    // Put your answer for #18 in this repo:
    RandomIncrementer ranInc = new RandomIncrementer();
    SequentialIncrement seqInc = new SequentialIncrement();

    ranInc.increment();
    seqInc.increment();

    System.out.println(ranInc.getValue());
    System.out.println(seqInc.getValue());
  }

  public static void printInfo(Shape s) {
    System.out.println("The shape: " + s.toString());
    System.out.println("area : " + s.area());
    System.out.println("perim: " + s.perimeter());
    System.out.println("sides: " + s.getSideCount());
  }
}

interface Colored {
  public Color getColor();
}

class Point implements Colored{
  private int x;
  private int y;
  private Color color;

  // Constructs a new point at (0, 0).
  public Point() {
    x = 0;
    y = 0;
    color = Color.BLACK;
  }

  public Color getColor(){
    return this.color;
  }

  // Constructs a Point at the given x/y location.
  public Point(int initialX, int initialY) {
    x = initialX;
    y = initialY;
  }

  // A "read-only" access to the x field ("accessor")
  public int getX() {
    return x;
  }

  // Allows clients to change the x field ("mutator")
  public void setX(int newX) {
    x = newX;
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

  // Used with Java graphics:
  // Draws the given point on the DrawingPanel.
  public void draw(Graphics g) {
  g.fillOval(x, y, 3, 3);
  g.drawString("(" + x + ", " + y + ")", x, y);
  }
}

interface Shape {
  public double area();
  public double perimeter();
  public int getSideCount();
}

// Represents circles.
class Circle implements Shape {
  private double radius;
  // Constructs a new circle with the given radius.
  public Circle(double radius) {
  this.radius = radius;
  }
  // Returns the area of this circle.
  public double area() {
  return Math.PI * radius * radius;
  }
  // Returns the perimeter of this circle.
  public double perimeter() {
  return 2.0 * Math.PI * radius;
  }

  public int getSideCount(){
    return 1;
  }
}

// Represents rectangles.
class Rectangle implements Shape {
  private double width;
  private double height;
  // Constructs a new rectangle with the given dimensions.
  public Rectangle(double width, double height) {
  this.width = width;
  this.height = height;
  }
  // Returns the area of this rectangle.
  public double area() {
  return width * height;
  }
  // Returns the perimeter of this rectangle.
  public double perimeter() {
  return 2.0 * (width + height);
  }

  public int getSideCount(){
    return 4;
  }
}

// Represents triangles.
class Triangle implements Shape {
  private double a;
  private double b;
  private double c;
  // Constructs a new Triangle given side lengths.
  public Triangle(double a, double b, double c) {
  this.a = a;
  this.b = b;
  this.c = c;
  }
  // Returns this triangle's area using Heron's formula.
  public double area() {
  double s = (a + b + c) / 2.0;
  return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }
  // Returns the perimeter of this triangle.
  public double perimeter() {
  return a + b + c;
  }

  public int getSideCount(){
    return 3;
  }
}

class Octagon implements Shape {
  private double a;
  // Constructs a new Triangle given side lengths.
  public Octagon(double a) {
  this.a = a;
  }
  // Returns this triangle's area using Heron's formula.
  public double area() {
  double s = (2*(a*a))*(1+Math.sqrt(2.00));
  return s;
  }
  // Returns the perimeter of this triangle.
  public double perimeter() {
  return a * 8;
  }

  public int getSideCount(){
    return 8;
  }

}

class Hexagon implements Shape {
  private double a;
  // Constructs a new Triangle given side lengths.
  public Hexagon(double a) {
  this.a = a;
  }
  // Returns this triangle's area using Heron's formula.
  public double area() {
  double s = ((3*Math.sqrt(3))/2) * (a*a);
  return s;
  }
  // Returns the perimeter of this triangle.
  public double perimeter() {
  return a * 6;
  }

  public int getSideCount(){
    return 6;
  }
}

interface Incrementable {
  public int getValue();
  public void increment();
  
}

class SequentialIncrement implements Incrementable {
  int num = 0;
  public int getValue(){
    return num;
  }
  public void increment(){
    num++;
  }
}

class RandomIncrementer implements Incrementable {
  int num = 0;
  Random random = new Random();

  public int getValue(){
    return num;
  }

  public void increment(){
    num += random.nextInt(10)+1;
  }
}