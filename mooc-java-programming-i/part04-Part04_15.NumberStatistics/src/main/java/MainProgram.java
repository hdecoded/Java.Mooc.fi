import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!

        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        System.out.println("Enter numbers: ");
        while (true) {
            int no = Integer.valueOf(scanner.nextLine());
            if (no == -1) {
                break;
            }

            if (no % 2 == 0) {
                statisticsEven.addNumber(no);
            } else {
                statisticsOdd.addNumber(no);
            }

            statistics.addNumber(no);
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());

//        Statistics statistics = new Statistics();
////        statistics.addNumber(3);
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());
    }
}