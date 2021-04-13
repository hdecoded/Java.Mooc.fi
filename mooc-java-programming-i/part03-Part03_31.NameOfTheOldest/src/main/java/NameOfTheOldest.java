import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldAge = 0;
        String oldName = null;
        while (true) {
            String namesAndAges = scanner.nextLine();
            if (namesAndAges.equals("")) {
                break;
            }

            String[] pieces = namesAndAges.split(",");


            int age = Integer.valueOf(pieces[1]);
            if (oldAge < age) {
                oldAge = age;
                oldName = pieces[0];
            }

        }
        System.out.println("Name of the oldest: " + oldName);
    }
}
