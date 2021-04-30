
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here

        String fileName = scanner.nextLine();
        read(fileName).stream().forEach(line -> System.out.println(line));

    }

    public static List<String> read(String file){
        List<String> rows =  new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).forEach(row -> rows.add(row));

        } catch (IOException io) {
            System.out.println(file + " not found ");
        }
        return rows;
    }

}
