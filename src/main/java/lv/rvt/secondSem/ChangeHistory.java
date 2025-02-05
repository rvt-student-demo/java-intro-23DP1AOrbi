package lv.rvt.secondSem;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> records;

    public ChangeHistory() {
        this.records = new ArrayList<>();
    }

    public void add(double status) {
        this.records.add(status);
    }

    public void clear() {
        this.records.clear();
    }

    public String toString() {
        return this.records.toString();
    }

    public double maxValue() {
        double max = this.records.get(0);
        for (int i = 0; i < this.records.size(); i++) {
            if (this.records.get(i) > max) {
                max = this.records.get(i);
            }
        }
        return max;
    }

    public double minValue() {
        if (this.records.size() == 0) {
            return 0;
        }

        double min = this.records.get(0);
        for (int i = 0; i < this.records.size(); i++) {
            if (this.records.get(i) < min) {
                min = this.records.get(i);
            }
        }
        return min;
    }

    public double average() {
        if (this.records.size() == 0) {
            return 0;
        }

        double avrg = 0;
        int count = 0;

        for (int i = 0; i < this.records.size(); i++) {
            avrg += this.records.get(i);
            count++;
        }
        return avrg/count;
    }
}
