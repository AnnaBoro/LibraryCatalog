package lesson4.LibraryCatalog;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by anna on 30.10.15.
 */
public class Launcher {

    public static void main(String[] args) {

        Library library = new Library();
        Book book1 = new Book("Salads", "Swift", Genre.FOOD);
        library.addBookToCatalog(book1);
        book1 = new Book("Totosha", "Gorkiy", Genre.CHILDREN);
        library.addBookToCatalog(book1);
        book1 = new Book("Meat", "Gogol", Genre.FOOD);
        library.addBookToCatalog(book1);
        book1 = new Book("Dogs", "Salanov", Genre.CHILDREN);
        library.addBookToCatalog(book1);
        book1 = new Book("Ivan Groznyi", "Filatov", Genre.HISTORY);
        library.addBookToCatalog(book1);
        book1 = new Book("Pompei", "Kristian", Genre.HISTORY);
        library.addBookToCatalog(book1);
        book1 = new Book("Napoleon", "Sonn", Genre.HISTORY);
        library.addBookToCatalog(book1);
        book1 = new Book("Java", "Troll", Genre.COMPUTERS);
        library.addBookToCatalog(book1);
        book1 = new Book("C++", "Wern", Genre.COMPUTERS);
        library.addBookToCatalog(book1);
        book1 = new Book("Pattern", "GoF", Genre.COMPUTERS);
        library.addBookToCatalog(book1);
        book1 = new Book("Spring", "Lloyd", Genre.COMPUTERS);
        library.addBookToCatalog(book1);
        book1 = new Book("Alice in...", "LCaroll", Genre.CHILDREN);
        library.addBookToCatalog(book1);
        book1 = new Book("Petr1", "Kazanin", Genre.HISTORY);
        library.addBookToCatalog(book1);
        book1 = new Book("HTML", "Ghost", Genre.COMPUTERS);
        library.addBookToCatalog(book1);
        book1 = new Book("Pizza", "Vysockaya", Genre.FOOD);
        library.addBookToCatalog(book1);
        book1 = new Book("Grill", "Delovoy", Genre.FOOD);
        library.addBookToCatalog(book1);
        book1 = new Book("Kolobok", "Narod", Genre.CHILDREN);
        library.addBookToCatalog(book1);
        book1 = new Book("Skazki", "Narodny", Genre.CHILDREN);
        library.addBookToCatalog(book1);
        book1 = new Book("Zhar-Ptiza", "Bubnov", Genre.CHILDREN);
        library.addBookToCatalog(book1);
        book1 = new Book("Soup", "Oliver", Genre.FOOD);
        library.addBookToCatalog(book1);
        book1 = new Book("Java2", "Horstmann", Genre.COMPUTERS);
        library.addBookToCatalog(book1);
        book1 = new Book("Skazki narodov mira", "Narody mira", Genre.CHILDREN);
        library.addBookToCatalog(book1);

        library.printBook(library.searchByName("soup"));
        library.printBook(library.searchByAuthor("ghost"));

        Book[] res1 = library.searchByGenre(Genre.CHILDREN);
        for (int i = 0; i < 5; i++) {
            if (res1[i] != null) {
                library.printBook(res1[i]);
            }
        }

        Book[] res2 = library.searchByGenre(Genre.CHILDREN);
        for (int i = 0; i < 5; i++) {
            if (res2[i] != null) {
                library.printBook(res2[i]);
            }
        }
    }
}
