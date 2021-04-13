import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;
        while (true) {

            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] pieces = input.split(" ");
            int amount = Integer.parseInt(pieces[1]);

            if (amount <= 0) {
                continue;
            }

            if (pieces[0].equals("add")) {
                firstContainer = firstContainer + amount;
                if (firstContainer  > 100) {
                    firstContainer = 100;
                }
            }

            if (pieces[0].equals("move")) {

                if(amount > firstContainer){
                    amount = firstContainer;
                }

                secondContainer = secondContainer + amount;

                if (secondContainer > 100) {
                    secondContainer = 100;
                }

                firstContainer = firstContainer - amount;
            }

            if (pieces[0].equals("remove")) {
                secondContainer = secondContainer - amount;
                if (secondContainer < 0) {
                    secondContainer = 0;
                }
            }
        }
    }
}
