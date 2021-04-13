
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        // Creating Scanner
        Scanner scanner = new Scanner(System.in);

        // Declaring the variables and assigning user input to them
        int no = Integer.valueOf(scanner.nextLine());

        // using if else
        if (no < 0) {
            System.out.println(no * -1);
        } else {
            System.out.println(no);
        }

    }
}
