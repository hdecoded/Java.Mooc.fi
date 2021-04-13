import java.util.ArrayList;

public class Recipe {

    private String recipeName;
    private int cookingTime;
    private ArrayList<String> ingredients = new ArrayList<>();

    public Recipe(String recipeName, int cookingTime) {
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
    }

    public void addIngrediant(String ingrediant){
        this.ingredients.add(ingrediant);
    }

    public String getRecipeName() {
        return recipeName;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return this.recipeName + ", cooking time: " + this.cookingTime;
    }
}