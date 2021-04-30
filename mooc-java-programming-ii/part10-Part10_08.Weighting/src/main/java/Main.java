

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        Hold cargo1 = new Hold(20);
        Suitcase sc1 = new Suitcase(10);
        Suitcase sc2 = new Suitcase(4);
        Item item1 = new Item("bowl",5);
        Item item2 = new Item("glass",5);
        Item item3 = new Item("laptop", 3);
        Item item4 = new Item("laptop", 3);
        sc1.addItem(item1);
        sc1.addItem(item2);
        sc1.addItem(item3);
        sc2.addItem(item4);
        cargo1.addSuitcase(sc1);
        cargo1.addSuitcase(sc2);
        cargo1.printItems();

    }

}
