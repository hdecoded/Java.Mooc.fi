
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {

            while (fileScanner.hasNextLine()){
                String fileText = fileScanner.nextLine();
                System.out.println(fileText);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
