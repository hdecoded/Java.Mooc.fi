import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> text = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String fileContent = fileScanner.nextLine();
                text.add(fileContent);
            }
        } catch (IOException e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        boolean found = false;
        for (String search : text) {
            if (search.equals(searchedFor)) {
                System.out.println("Found!");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found.");
        }


    }
}
