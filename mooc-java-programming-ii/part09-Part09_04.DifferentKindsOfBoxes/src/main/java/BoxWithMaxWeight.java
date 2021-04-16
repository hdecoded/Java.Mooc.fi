import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;


    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();

    }

    @Override
    public void add(Item item) {

        if (this.weightOfItems() + item.getWeight() <= this.capacity) {
            this.items.add(item);
        }
    }

    private int weightOfItems() {
        int boxWeight = 0;
        for (Item item : items) {
            boxWeight = boxWeight + item.getWeight();
        }
        return boxWeight;
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
