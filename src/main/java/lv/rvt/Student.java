package lv.rvt;

public class Student {
    private int credits;

    public Student() {
        this.credits = 0;
        // this. velk tieši no šis klases -> credits
    }

    public void play() {
        this.credits -= 8;
    }

    

}
