package lv.rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
       this.money = 1000;
    }

    public double eatAffordably(double payment) {
        affordableMeals++;
        this.money += 2.5;
        return payment-2.5;
        }

    public double eatHeartily(double payment) {
        heartyMeals++;
        this.money += 4.3;
        return payment-4.3;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() - 2.5 < 0) {
            return false;
        }
        else {
            affordableMeals++;
            card.takeMoney(2.5);
            return true;
        }
    }
    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() - 4.30 < 0) {
            return false;
        }
        else {
            heartyMeals++;
            card.takeMoney(4.3);
            return true;
        }
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
