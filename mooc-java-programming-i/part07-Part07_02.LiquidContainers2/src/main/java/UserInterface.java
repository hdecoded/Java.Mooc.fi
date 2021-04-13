import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Container container;
    private Container container2;

    public UserInterface(Container container, Container container2, Scanner scanner) {
        this.scanner = scanner;
        this.container = container;
        this.container2 = container2;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + container);
            System.out.println("Second: " + container2);

            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] pieces = input.split(" ");
            int amount = Integer.parseInt(pieces[1]);

            if (pieces[0].equals("add")) {
                container.add(amount);
            }

            if (pieces[0].equals("move")) {
                if (container.contains() < amount) {
                    amount = container.contains();
                }

                container2.add(amount);
                container.remove(amount);
            }

            if (pieces[0].equals("remove")) {
                container2.remove(amount);
            }
        }
    }
}
