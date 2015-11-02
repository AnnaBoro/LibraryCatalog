package lesson4.LibraryCatalog;

/**
 * Created by anna on 28.10.15.
 */
public class Book {

    private String author;
    private String name;
    private Genre genre;

    public Book() {

    }

    public Book(String name, String author, Genre genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }
}
