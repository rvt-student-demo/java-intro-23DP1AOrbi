package lv.rvt;

public class DecreasingCounter {
    private int value;

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("Value: " + this.value);
    }

    public void decrement() {
        this.value -= 1;
        if (this.value < 0) {
            this.value = 0;
        }
    }
    
    public void reset() {
        this.value = 0;
    }

    public void decrement(int number) {
        this.value = this.value - number;
    }

    public void reset(int number) {
        this.value = number;
    }

}