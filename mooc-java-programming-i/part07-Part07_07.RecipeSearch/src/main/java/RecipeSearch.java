import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Recipe> recipes = new ArrayList<>();
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        System.out.println();

        UserInsterface.fileReader(recipes, fileName);

        UserInsterface.commands(scanner, recipes);
    }

}