package lv.rvt;

public class Timer {
    private ClockHand seconds;
    private ClockHand hundrethSeconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundrethSeconds = new ClockHand(100);
    }
    public void advance() {
        this.hundrethSeconds.advance();

        if (this.hundrethSeconds.value() == 0) {
            this.seconds.advance();
        }

    }

    public String toString() {
        return seconds + ":" + hundrethSeconds;
    }


}