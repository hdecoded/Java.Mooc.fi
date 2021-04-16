import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Container container1;
    private Container container2;

    public UserInterface(Scanner scanner, Container container1, Container container2) {
        this.scanner = scanner;
        this.container1 = container1;
        this.container2 = container2;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);
            String input = scanner.nextLine();

            if(input.equals("quit")){
                break;
            }

            String[] inputPieces = input.split(" ");
            String command = inputPieces[0];
            int amount = Integer.valueOf(inputPieces[1]);

            if (command.equals("add")) {
                container1.add(amount);
            }

            if (command.equals("remove")) {
                container2.remove(amount);
            }

            if (command.equals("move")) {
                if (amount > container1.contains()) {
                    amount = container1.contains();
                }
                container2.add(amount);
                container1.remove(amount);
            }
        }
    }
}
