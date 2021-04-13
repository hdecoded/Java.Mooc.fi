import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int no = Integer.valueOf(scanner.nextLine());


            if (no != 0) {
                counter++;
                sum = sum + no;
                continue;
            }
            break;
        }
        System.out.println("Number of numbers: " + counter);
        System.out.println("Sum of the numbers: " + sum);
    }
}
