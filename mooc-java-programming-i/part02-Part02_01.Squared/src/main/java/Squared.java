
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        // Creating the Scanner
        Scanner scanner = new Scanner(System.in);

        // Reading the integer
        int no = Integer.valueOf(scanner.nextLine());

        // Squaring the input no
        int noSqaure = no * no;

        // Printing the Square of the number
        System.out.println(noSqaure);

    }
}
