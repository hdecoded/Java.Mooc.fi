
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

        String input = scanner.nextLine();

        readBooks(input).stream().forEach(book -> System.out.println(book));



    }

    public static List<Book> readBooks(String file){
        List<Book> books = new ArrayList<>();

        try{
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .map(parts -> new Book(parts[0],Integer.valueOf(parts[1]),Integer.valueOf(parts[2]),parts[3]))
                    .forEach(book -> books.add(book));
        } catch (IOException e) {
            System.out.println(file + " not found");
        }
        return books;
    }

}