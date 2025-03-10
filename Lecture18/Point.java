import java.awt.*;

public class Point {
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
