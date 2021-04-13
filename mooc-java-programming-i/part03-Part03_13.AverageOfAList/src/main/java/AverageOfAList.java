import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int no = Integer.valueOf(scanner.nextLine());
            if (no == -1) {
                break;
            }

            list.add(no);
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }

        System.out.println("Average: " + 1.0 * (sum)/list.size());

    }
}
