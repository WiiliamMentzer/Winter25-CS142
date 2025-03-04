public class Lecture16 {

  //Lecture 16 by William Mentzer for CS-142
  //Note: added all the classes to the bottom to keep 1 java file instead of sending 4 java files.
  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

    // Put your answer for #1 here:
    //Code Reuse is the practice of writing code once and using it in many contexts.
    //Inheritance allows for other classes to be grouped together and allows them to keep simimlar attributes and behaviors.

    // Put your answer for #2 here:
    // overloading is when its the same method but it takes different paramaters.
    // overiding is when a new version of a method replaces the inherited version.

    // Put your answer for #3 here:
    // public void classB extends classA{
    //}

    // Put your answer for #4 here:
    //when using this. it will pull data from the class itself whichever value is stored this.classB name will be classB name.
    //If the super is used it will pull that value from its inhereted class. classB will take classA's name for example.

    // Put your answer for #5 here:
    // Yes it does, the UnderZGradStudent will have its fields privated to the object.

    // Put your answer for #6 here:
    /*
    public underGradStudent (int yearInit, int age) { 
        this.year = yearInit; 
        this.age = super(age);
    }
    */

    // Put your answer for #7 here:
    /*
    public void setAge (int age) { 
    this.age = age;
    this.year++;
    }
    */

    // Put your answer for #8 here:
    /*
    vroom
    Car1
    Car2
    vroom vroom
    Truck1
    Car2
    */

    // Put your answer for #9 here:
    /*

    vroom vroom
    Truck1
    Car1

    */

    // EXERCISES:

    // Put your answer for #1 in this repo
    Marketer mark1 = new Marketer(10);
    mark1.advertise();
    System.out.println(mark1.getSalary());
    System.out.println(mark1.getVacationDays());
    System.out.println(mark1.getHours());
    


    // Put your answer for #2 in this repo
    Janitor jan1 = new Janitor(5);
    System.out.println(jan1.getVacationDays());
    System.out.println(jan1.getSalary());
    System.out.println(jan1.getVacationForm());

    jan1.clean();
  }
}

class Employee {

  private int years;

  public Employee(int initialYears) {
      years = initialYears;
  }

  public int getHours() {
      return 40;
  }

  public double getSalary() {
      return 40000.0;
  }

  public int getVacationDays() {
      return 10;
  }

  public String getVacationForm() {
      return "yellow";
  }

}


class Janitor extends Employee {

  public Janitor(int years) {
      super(years);
  }

  public void clean() {
      System.out.println("Workin for the man");
  }

  public int getHours() {
      return super.getHours() * 2;
  }

  public double getSalary() {
      return super.getSalary() - 10000;
  }

  public int getVacationDays() {
      return super.getVacationDays() / 2;
  }

}

class Marketer extends Employee {

  public Marketer(int years) {
      super(years);
  }

  public void advertise() {
      System.out.println("Act now while supplies last!");
  }

  public double getSalary() {
      return super.getSalary() + 10000.0;
  }

}
