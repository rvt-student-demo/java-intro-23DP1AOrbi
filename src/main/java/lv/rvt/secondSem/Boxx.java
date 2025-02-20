package lv.rvt.secondSem;

import java.util.ArrayList;

public class Boxx implements Packable {
    private double capacity;
    private ArrayList<Packable> weightable;

    public Boxx(double capacity) {
        this.capacity = capacity;
        this.weightable = new ArrayList<>();
    }

    public void add(Packable weightable) {
        double currentWeight = weight();
        if (this.capacity > currentWeight + weightable.weight()) {
            this.weightable.add(weightable);
        } 
    }

    public double weight() {
        double weight = 0;
        for (Packable packable : weightable) {
            weight += packable.weight();
        }
        return weight;
    }

    public String toString() {
        return "Box: " + this.weightable.size() + " items, total weight " + weight() + " kg";
    }

}
