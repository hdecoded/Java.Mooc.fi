
public class Main {

    public static void main(String[] args) {
        PaymentTerminal terminal = new PaymentTerminal();
        PaymentCard card = new PaymentCard(2.5);
        System.out.println(terminal);
        terminal.eatAffordably(card);
        System.out.println(terminal);
    }
}

