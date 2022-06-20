package JavaStudyDate.day19.lambda;

public class Book {
    enum Genre{
        HISTORY, COMICS, BIBLE
    }
    private int price;
    private Genre genre;

    public Book(){}
    public Book(int price, Genre genre) {
        this.price = price;
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", genre=" + genre +
                '}';
    }
}
