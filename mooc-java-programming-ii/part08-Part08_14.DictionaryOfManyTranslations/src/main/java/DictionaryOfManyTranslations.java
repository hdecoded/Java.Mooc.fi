import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translationDictionary;

    public DictionaryOfManyTranslations() {
        this.translationDictionary = new HashMap<>();
    }

    public void add(String word, String translation) {

        this.translationDictionary.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> translations = this.translationDictionary.get(word);
        translations.add(translation);
    }

    public ArrayList<String> translate(String word) {

        ArrayList<String> translations = this.translationDictionary.get(word);
        if (translations == null) {
            return new ArrayList<String>();
        }
        return translations;
    }

    public void remove(String word) {
        this.translationDictionary.remove(word);
    }
}
