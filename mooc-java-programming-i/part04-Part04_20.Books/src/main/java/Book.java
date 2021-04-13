public class Book {
    private String title;
    private int noOfPages;
    private int publishedYear;

    public Book(String title, int noOfPages, int publishedYear) {
        this.title = title;
        this.noOfPages = noOfPages;
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return this.title + ", "+ this.noOfPages + " pages, " + this.publishedYear;
    }
}