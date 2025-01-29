package lv.rvt;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name, String adress, int monthlySalary) {
        super(name, adress);
        this.salary = monthlySalary;
    }

    public String toString() {
        return super.toString() + "\n    salary " + this.salary + " euro/month";
    }
}
