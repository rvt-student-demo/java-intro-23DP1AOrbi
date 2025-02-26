package lv.rvt.secondSem;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros , this.cents + addition.cents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros * 100 + this.cents < compared.euros * 100 + compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        if ((this.euros * 100 + this.cents) - (decreaser.euros * 100 + decreaser.cents) < 0) {
            return new Money(0, 0);
        }
        int newMoney = (this.euros * 100 + this.cents) - (decreaser.euros * 100 + decreaser.cents);

        return new Money((int)Math.floor(newMoney / 100), newMoney % 100);
    }
}
