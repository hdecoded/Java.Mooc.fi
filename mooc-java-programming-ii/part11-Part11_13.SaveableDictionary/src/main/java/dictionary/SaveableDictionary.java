package dictionary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> dictionary = new HashMap<>();
    private String file;

    public SaveableDictionary() {
    }

    public SaveableDictionary(String file) {
        this.file = file;
    }

    public boolean load() {
        try (Scanner scanner = new Scanner(Paths.get(this.file))) {
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                String[] parts = text.split(":");
                if (this.dictionary != null) ;
                this.dictionary.put(parts[0], parts[1]);
            }

        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public void add(String words, String translation) {
        if (this.dictionary.containsKey(words)) {
            return;
        }
        this.dictionary.put(words, translation);
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } else if (this.dictionary.containsValue(word)) {
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                String word2 = entry.getValue();
                if (entry.getValue().equals(word)) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }

    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        }
        Iterator<Map.Entry<String, String>> iterator = dictionary.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (word.equals(entry.getValue())) {
                iterator.remove();
            }
        }
    }

    public boolean save() {
        try {
            PrintWriter printWriter = new PrintWriter(this.file);

            for (String key : this.dictionary.keySet()) {
                printWriter.println(key + ":" + this.dictionary.get(key));
            }
            printWriter.close();
        } catch (IOException e){
            return false;
        }
        return true;
    }
}
