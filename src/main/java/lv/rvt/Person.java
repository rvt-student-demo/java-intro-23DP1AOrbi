package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    // Glabā saiti uz citu objektu
    private SimpleDate birthday;

    //overloading

    public Person(String initialName, int initialAge, int initialHeight, int initialWeight) {
        this.age = initialAge;
        this.weight = initialWeight;
        this.height = initialHeight;
        this.name = initialName;
    }

    public Person(String initalName) {
        this.name = initalName;
    }

    public Person(String initalName, SimpleDate date) {
        this(initalName, 0, 0, 0);
        this.birthday = date;
    }

    

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void growOlder() {
        if (this.age < 30) {
            this.age = this.age + 1;
        }
    }
    /////

    public boolean isOfLegalAge() {
        if (this.age < 18) {
            return false;
        }

        return true;
    }

    public String getName() {
        return this.name;
    }
    ////////
    /// 
    public String toString() {
        return this.name + ", " + this.age + " years old, " +  this.weight + "kg, " + this.height + "cm";
    }

    public String toCsvRow() {
        return this.name + ", " + this.age + ", " + this.weight + ", " + this.height;
    }

    public int getAge() {
        return this.age;
    }
    public int getHeight() {
        return this.height;
    }
    public int getWeight() {
        return this.weight;
    }
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }

    public void setAge(int ageNow) {
        this.age = ageNow;
    }
    public void setName(String nameNow) {
        this.name = nameNow;
    }

}
