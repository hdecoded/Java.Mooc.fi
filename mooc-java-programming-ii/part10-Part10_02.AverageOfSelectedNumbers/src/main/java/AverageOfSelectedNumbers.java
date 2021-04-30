
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers, type \"end\" to stop.");
        List<String> number = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;

            }
            number.add(input);
        }

        double positiveAvg = number.stream().mapToInt(s -> Integer.valueOf(s)).filter(s -> s > 0).average().getAsDouble();
        double negativeAvg = number.stream().mapToInt(s -> Integer.valueOf(s)).filter(s -> s < 0).average().getAsDouble();


        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        if (input.equals("p")) {
            System.out.println("Average of the positive numbers: " + positiveAvg);
        } else if (input.equals("n")) {
            System.out.println("Average of the positive numbers: "+ negativeAvg);
        }
    }
}
