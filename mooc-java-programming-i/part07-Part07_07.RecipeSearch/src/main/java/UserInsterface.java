import org.graalvm.compiler.lir.LIRInstruction;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInsterface {

    public UserInsterface() {
    }

    public static void commands(Scanner scanner, ArrayList<Recipe> recipes) {
        System.out.println("Commands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient\n");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("list")) {
                for(Recipe recipe : recipes){
                    System.out.println(recipe);
                }
            }

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();
                System.out.println();
                System.out.println("Recipes: ");
                for(Recipe recipe : recipes){
                    if(recipe.getRecipeName().contains(word)){
                        System.out.println(recipe);
                    }
                }
            }

            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println();
                System.out.println("Recipes: ");
                for(Recipe recipe:recipes){
                    int ct = recipe.getCookingTime();
                    if(ct <= maxCookingTime){
                        System.out.println(recipe);
                    }
                }
            }

            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingerdient = scanner.nextLine();
                System.out.println();
                System.out.println("Recipes: ");
                for(Recipe recipe : recipes){
                    if(recipe.getIngredients().contains(ingerdient)){
                        System.out.println(recipe);
                    }

                }
            }
            System.out.println();
        }
    }

    public static void fileReader(ArrayList<Recipe> recipes, String fileName) {
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {

            while (fileReader.hasNextLine()) {
                String recipeName = fileReader.nextLine();
                int cookingTime = Integer.valueOf(fileReader.nextLine());

                Recipe recipe = new Recipe(recipeName, cookingTime);
                recipes.add(recipe);

                while (fileReader.hasNextLine()) {
                    String ingredient = fileReader.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addIngrediant(ingredient);
                }
            }
        } catch (IOException e) {
            System.out.println(fileName + " not found");
        }
    }
}
