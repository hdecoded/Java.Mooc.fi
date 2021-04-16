import java.util.ArrayList;

public class Box implements Packable {

    private double maxCapacity;
    private ArrayList<Packable> items;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (this.weight() + packable.weight() < maxCapacity) {
            this.items.add(packable);
        }
    }

    @Override
    public double weight() {
        double boxWeight = 0;
        for (Packable item : items) {
            boxWeight = boxWeight + item.weight();
        }
        return boxWeight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + this.weight() + " kg";
    }
}
