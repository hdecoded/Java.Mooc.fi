import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int olderAge = 0;
        while (true) {
            String namesAndages = scanner.nextLine();

            if (namesAndages.equals("")) {
                break;
            }

            String[] pieces = namesAndages.split(",");
            
            for (int i = 0, piecesLength = pieces.length; i < piecesLength; i++) {
                if (olderAge < Integer.valueOf(pieces[1])) {
                    olderAge = Integer.valueOf(pieces[1]);
                }
            }
        }
        System.out.println("Age of the oldest: " + olderAge);

    }
}
