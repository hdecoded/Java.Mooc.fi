import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while (true) {
            System.out.println("Give a number:");
            int no = Integer.valueOf(scanner.nextLine());

            if (no != 0) {
                if (no < 0) {
                    counter++;
                }
                continue;
            }
            break;
        }
        System.out.println("Number of negative numbers: " + counter);
    }
}
