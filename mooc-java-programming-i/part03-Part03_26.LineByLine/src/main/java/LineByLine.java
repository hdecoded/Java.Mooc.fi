import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        while (true) {
            text = scanner.nextLine();
            if (text.isEmpty()) {
                break;
            }
            String pieces[] = text.split(" ");
            for (String i : pieces) {
                System.out.println(i);
            }
        }
    }
}
