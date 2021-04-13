import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while (true) {
            int no = Integer.valueOf(scanner.nextLine());

            if (no > 0) {
                sum = sum + no;
                counter++;
            }

            if (no == 0) {
                break;
            }
        }
        float avg = (float) (1.0 * sum / counter);

        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        } else{
            System.out.println(avg);
        }
    }
}
