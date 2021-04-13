import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if(totalWeight() + suitcase.totalWeight() <= maxWeight){
            suitcases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }

    private int totalWeight() {
        int totalWeight = 0;
        for(Suitcase suitcase : suitcases){
            totalWeight = totalWeight + suitcase.totalWeight();
        }
        return totalWeight;
    }

    public void printItems(){
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }

    }
}
