import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.print("search for? ");
        String searchText = scanner.nextLine();

        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            if (temp.equals(searchText)) {
                System.out.println(searchText + " was found!");
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println(searchText + " was not found!");
        }

    }
}
