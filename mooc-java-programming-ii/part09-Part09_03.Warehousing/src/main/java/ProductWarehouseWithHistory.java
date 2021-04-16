public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory = new ChangeHistory();

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistory.add(super.getBalance());
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        amount = super.takeFromWarehouse(amount);
        changeHistory.add(super.getBalance());
        return amount;
    }

    public String history() {
        return changeHistory.toString();
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName() + "\n" +
                "History: " + history() + "\n" +
                "Largest amount of product: " + changeHistory.maxValue() + "\n" +
                "Smallest amount of product: " + changeHistory.minValue() + "\n" +
                "Average: "+changeHistory.average());
    }
}
