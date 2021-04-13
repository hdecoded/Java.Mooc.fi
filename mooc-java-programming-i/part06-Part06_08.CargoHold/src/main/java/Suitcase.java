import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= this.maxWeight) {
            items.add(item);
        }
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (items.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        }
        return items.size() + " items (" + totalWeight() + " kg)";
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight = totalWeight + item.getWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()){
            return null;
        }

        Item heaviest = items.get(0);
        for (Item item : items)
        if(heaviest.getWeight() < item.getWeight()){
            heaviest = item;
        }
        return heaviest;
    }
}

