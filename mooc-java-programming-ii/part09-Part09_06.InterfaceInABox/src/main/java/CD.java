public class CD implements Packable {

    private final double weight = 0.1;
    private String cdArtist;
    private String cdName;
    private int cdPublicationYear;

    public CD(String cdArtist, String cdName, int cdPublicationYear) {
        this.cdArtist = cdArtist;
        this.cdName = cdName;
        this.cdPublicationYear = cdPublicationYear;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return cdArtist +": " + cdName + " (" + cdPublicationYear + ")";
    }
}
