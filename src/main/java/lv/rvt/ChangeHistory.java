package lv.rvt;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {

    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public String toString() {
        System.out.println(history);
        return "";
    }

    public double maxValue() {
        double max = 0.0;
        for (int i = 0; i < history.size(); i++) {
            if (history.get(i) > max) {
                max = history.get(i);
            }
        }
        return max;
    }

    public double minValue() {
        if (history.size() == 0) {
            return 0;
        }

        double min = history.get(0);
        for (int i = 0; i < history.size(); i++) {
            if (history.get(i) < min) {
                min = history.get(i);
            }
        }
        return min;
    }

    public double average() {
        if (history.size() == 0) {
            return 0;
        }

        double avrg = 0;
        int count = 0;

        for (int i = 0; i < history.size(); i++) {
            avrg += history.get(i);
            count++;
        }
        return avrg/count;
    }
}
