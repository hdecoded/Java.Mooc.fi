public class Bird {
    private String name;
    private String nameInLatin;
    private int observations = 0;

    public Bird(String name, String nameInLatin) {
        this.name = name;
        this.nameInLatin = nameInLatin;
    }

    public String getName() {
        return name;
    }

    public void observed() {
        this.observations++;
    }

    @Override
    public String toString() {
        return name + " (" + nameInLatin + "):" + observations + " observations";
    }
}
