package lv.rvt;

public class Student extends Person{
    private int credits;

    // public Student() {
    //     this.credits = 0;
    //     // this. velk tieši no šis klases -> credits
    // }
    public Student(String name, String adress) {
        super(name, adress);
        this.credits = 0;
    }

    public void play() {
        this.credits -= 8;
    }

    public int credits() {
        return this.credits;
    }

    public int study() {
        return this.credits++;
    }
    /////////////////  toString usage from a superclass
    public String toString() {
        return super.toString() + "\n    Student credits " + this.credits;
    }

}
