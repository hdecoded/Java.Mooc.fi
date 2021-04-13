import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes ;
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String Joke){
        jokes.add(Joke);
    }

    public String drawJoke(){
        if(!jokes.isEmpty()) {
            Random rand = new Random();
            return jokes.get(rand.nextInt(jokes.size()));
        }
        return "Jokes are in short supply.";
    }

    public void printJokes(){
        for (String joke : jokes){
            System.out.println(joke);
        }
    }

    public boolean isEmpty() {
        return jokes.isEmpty();
    }
}
