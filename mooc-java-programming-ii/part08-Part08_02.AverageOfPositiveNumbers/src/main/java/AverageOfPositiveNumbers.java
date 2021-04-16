import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input > 0) {
                numbers.add(input);
            }
        }
        printAverage(numbers);
    }

    private static void printAverage(ArrayList<Integer> numbers) {

        int sum = 0;
        for (int no : numbers) {
            sum = sum + no;
        }

        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * sum / numbers.size());
        }
    }
}
