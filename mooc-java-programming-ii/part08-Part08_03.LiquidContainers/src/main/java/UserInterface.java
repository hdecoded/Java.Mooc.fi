import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private LiquidContainer container1;
    private LiquidContainer container2;

    public UserInterface(Scanner scanner, LiquidContainer container1, LiquidContainer container2) {
        this.scanner = scanner;
        this.container1 = container1;
        this.container2 = container2;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + container1.getAmount() + "/100");
            System.out.println("Second: " + container2.getAmount() + "/100");
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] inputPieces = input.split(" ");
            String command = inputPieces[0];
            int amount = Integer.valueOf(inputPieces[1]);

            if (command.equals("add")) {
                container1.addAmount(amount);
            }

            if (command.equals("move")) {
                container1.move(amount,container1,container2);
            }

            if (command.equals("remove")){
                container2.remove(amount);
            }
        }
    }
}
