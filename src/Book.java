
import java.io.Serializable;
/**
 *a simple Book class that implements Serializable and has six instance variables:title,authors,price,isbn,genre,and year
 */
public class Book implements Serializable {
    /**
     * attributes
     */
    private String title;
    private String author;
    private double price;
    private String isbn;
    private String genre;
    private int year;

    /**
     * parameterized constructor
     *
     * @param title title of the book
     * @param author author of the book
     * @param price price of the book
     * @param isbn isbn of the book
     * @param genre genre of the book
     * @param year year of the book
     */
    Book(String title, String author, double price, String isbn, String genre, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        this.genre = genre;
        this.year = year;
    }

    /**
     * setter and getter method
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /**
     * toString method
     */
    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", price=" + price + ", isbn='" + isbn + '\'' + ", genre='" + genre + '\'' + ", year=" + year + '}';
    }

    /**
     * equals method
     */
    @Override
    public boolean equals(Object x) {
        if (x == null || x.getClass() != this.getClass()) return false;
        else {
            Book book = (Book) x;
            return Double.compare(book.getPrice(), getPrice()) == 0 && getYear() == book.getYear() && getTitle().equals(book.getTitle()) && getAuthor().equals(book.getAuthor()) && getIsbn().equals(book.getIsbn()) && getGenre().equals(book.getGenre());
        }
    }
}
