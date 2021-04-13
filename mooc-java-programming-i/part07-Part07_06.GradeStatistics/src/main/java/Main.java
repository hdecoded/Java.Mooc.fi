import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter point totals, -1 stops:");
        GradeStatistics gradeStatistics = new GradeStatistics();

        while (true) {

            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }
            gradeStatistics.add(input);
        }

        gradeStatistics.printStats();
    }
}
