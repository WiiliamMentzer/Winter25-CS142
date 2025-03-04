
public class Janitor extends Employee {

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
