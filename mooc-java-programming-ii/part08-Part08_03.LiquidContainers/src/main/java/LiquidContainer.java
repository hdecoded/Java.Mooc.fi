public class LiquidContainer {
    private int amount;

    public LiquidContainer() {
        this.amount = 0;
    }

    public void addAmount(int amount) {
        if (amount < 0) {
            return;
        }

        this.amount += amount;
        if (this.amount > 100) {
            this.amount = 100;
        }
    }

    public void move(int amount, LiquidContainer container1, LiquidContainer container2) {
        if (amount > container1.amount) {
            amount = container1.amount;
        }
        container2.addAmount(amount);
        container1.remove(amount);

    }

    public void remove(int amount) {
        if(amount < 0){
            return;
        }
        this.amount -= amount;
        if (this.amount < 0) {
            this.amount = 0;
        }
    }

    public int getAmount() {
        return this.amount;
    }
}
