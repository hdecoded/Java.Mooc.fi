import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.items.containsKey(product)) {
            this.items.get(product).increaseQuantity();
        } else {
            items.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int sum = 0;
        for (String item : items.keySet()) {
            sum = sum + items.get(item).price();
        }
        return sum;
    }

    public void print() {
        for (String item : items.keySet()) {
            System.out.println(item + ": " + items.get(item).getQty());
        }
    }


}
