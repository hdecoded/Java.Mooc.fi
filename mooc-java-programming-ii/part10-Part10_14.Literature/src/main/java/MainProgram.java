import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();

            if (bookName.equals("")) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int ageRecommendation = Integer.valueOf(scanner.nextLine());
            books.add(new Book(bookName,ageRecommendation));
        }


        Comparator<Book> comparator = Comparator.comparing(Book::getAge).thenComparing(Book::getName);

        Collections.sort(books,comparator);

        System.out.println(books.size() + " books in total.");
        System.out.println();
        System.out.println("Books:");

        books.stream().forEach(book -> System.out.println(book));

    }

}
