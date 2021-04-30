import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand implements Comparable<Hand>{
    private List<Card> hand = new ArrayList<>();

    public void add(Card card){
        this.hand.add(card);
    }

    public void print(){
        this.hand.stream().forEach(card -> System.out.println(card));
    }

    public void sort(){
        Collections.sort(this.hand,Card::compareTo);
    }

    private int sumofCard(List<Card> hand){
        return hand.stream()
                .mapToInt(card -> card.getValue())
                .sum();
    }

    private List<Card> getHand() {
        return hand;
    }

    @Override
    public int compareTo(Hand hand) {
        return sumofCard(this.hand) - sumofCard(hand.getHand());
    }

    public void sortBySuit(){
        Collections.sort(this.hand,new BySuitInValueOrder());
    }

}
