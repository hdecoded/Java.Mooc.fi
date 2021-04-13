import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longest = 0, sum = 0, counter = 0;
        String longName = null;
        while (true) {
            String nameAndYear = scanner.nextLine();
            if (nameAndYear.equals("")) {
                break;
            }
            counter++;
            String[] pieces = nameAndYear.split(",");
            int nameLength = pieces[0].length();
            if (longest < nameLength) {
                longest = nameLength;
                longName = pieces[0];
            }
            int year;
            year = Integer.parseInt(pieces[1]);
            sum = sum + year;
        }
        System.out.println("Longest name: " + longName);
        System.out.println("Average of the birth years: " + (float)1.0 * sum / counter);

    }
}
