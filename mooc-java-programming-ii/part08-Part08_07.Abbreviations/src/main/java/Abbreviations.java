import java.util.HashMap;

public class Abbreviations {

    HashMap<String,String> abbrevations;

    public Abbreviations() {
        this.abbrevations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        abbrevations.put(abbreviation,explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        if(abbrevations.containsKey(abbreviation)){
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation){
        if(hasAbbreviation(abbreviation)){
            return abbrevations.get(abbreviation);
        }
        return null;
    }
}
