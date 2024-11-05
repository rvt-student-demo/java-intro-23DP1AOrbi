package lv.rvt;

public class Animal {
    private String name;

    public Animal(String initialName) {
        this.name = initialName;
    }

    public String toString() {
        return "This is animal: " + this.name;
    }
}
