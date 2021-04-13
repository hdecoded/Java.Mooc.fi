import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Page: ");
            int noOfPages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title,noOfPages,year));
        }

        System.out.println();
        System.out.print("What information will be printed? ");
        String printInfo = scanner.nextLine();

        for(Book book : books){
            if (printInfo.equals("everything")){
                System.out.println(book);
            }
            if (printInfo.equals("name")){
                System.out.println(book.getTitle());
            }
        }
    }
}