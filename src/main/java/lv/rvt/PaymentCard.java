package lv.rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    public double balance(){ 
        return this.balance;
    }
    public void addMoney(double increase) {
        this.balance += increase;
    }
    public boolean takeMoney(double amount) {
        if (this.balance - amount < 0) {
            return false;
        }
        else {
            this.balance -= amount;
            return true;
        }
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros" ;
    }

    public void eatAffordably() {
        if (this.balance - 2.60 >= 0) {
            this.balance = this.balance - 2.60;
        }
    }
    
    public void eatHeartily() {
        if (this.balance - 4.60 >= 0) {
            this.balance = this.balance - 4.60;
        }
    }

    // public void addMoney(double amount) {
    //     if (this.balance + amount > 150) {
    //         this.balance = 150; 
    //     }
    //     else if (this.balance + amount < 0) {
    //         this.balance = this.balance;
    //     }
    //     else {
    //     this.balance += amount;
    //     }
    }


