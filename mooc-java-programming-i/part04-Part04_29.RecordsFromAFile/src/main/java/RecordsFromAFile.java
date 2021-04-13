import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();


        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                names.add(parts[0]);
                age.add(Integer.valueOf(parts[1]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i =0 ; i < names.size();i++) {
            System.out.println(names.get(i) + ", age: " + age.get(i) + " years");
        }

    }
}
