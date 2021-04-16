
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("pride", 1813, "...."));
        hashmap.put("happy", new Book("Don't let the pigeon drive the bus", 2003, "...."));
        printValueIfNameContains(hashmap, "ide");
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {

        for(String key : hashmap.keySet()){
            Book book = hashmap.get(key);
            if(book.getName().contains(text)){
                System.out.println(hashmap.get(key));
            }
        }
    }

    public static void printValues(HashMap<String,Book> hashmap) {

        for(String key : hashmap.keySet()){
            System.out.println(hashmap.get(key));
        }
    }

}
