import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> gifts = new ArrayList<>();

    public Package() {
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        if (gifts.isEmpty()) {
            return -1;
        }

        int totalWeight = 0;
        for (Gift gift : gifts){
            totalWeight = totalWeight + gift.getWeight();
        }
        return  totalWeight;
    }
}
