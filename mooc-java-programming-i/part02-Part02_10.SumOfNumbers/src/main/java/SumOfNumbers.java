
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int no = Integer.valueOf(scanner.nextLine());

            if (no != 0) {
                sum = sum + no;
                continue;
            }
            break;
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}
