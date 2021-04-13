public class PaymentCard {
    private final double affordable;
    private final double hearty;
    private double balance;


    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        this.affordable = 2.6;
        this.hearty = 4.6;
    }

    public void eatAffordably() {
        if (this.balance >= affordable) {
            this.balance -= affordable;
        }
    }

    public void eatHeartily() {

        if (this.balance >= hearty) {
            this.balance -= hearty;
        }
    }

    public void addMoney(double amount) {
        if (amount >= 0) {
            this.balance = this.balance + amount;
        }
        if (this.balance + amount > 150) {
            this.balance = 150;
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
}
