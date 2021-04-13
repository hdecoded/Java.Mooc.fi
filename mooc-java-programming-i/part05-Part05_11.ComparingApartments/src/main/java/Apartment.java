public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int apartmentValue(Apartment apartment) {
        return apartment.squares * apartment.pricePerSquare;
    }

    public int priceDifference(Apartment compared) {
        return Math.abs(apartmentValue(this) - apartmentValue(compared));
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return apartmentValue(this) > apartmentValue(compared);
    }
}
