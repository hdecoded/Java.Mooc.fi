import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lowest = Integer.valueOf(scanner.nextLine());
        int highest = 100;
        while (highest >= lowest) {
            System.out.println(lowest);
            lowest++;
        }
    }
}
