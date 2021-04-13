
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the integer values
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());

        // Calulate the sum
        int sum = first + second;
        double squareRoot = Math.sqrt(sum);

        //print the squareroot
        System.out.println(squareRoot);
    }
}
