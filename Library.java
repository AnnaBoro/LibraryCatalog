package lesson4.LibraryCatalog;

import java.util.Arrays;

/**
 * Created by anna on 30.10.15.
 */
public class Library {

    String abc = "abcdefghijklmnopqrstuvwxyz";
    private Book[][] bookListByName = new Book[26][50];
    private Book[][] bookListByAuthor = new Book[26][50];
    private Book[][] bookListByGenre = new Book[26][50];
    private  int viewedBook = 0;

    public Library() {

    }

    public int getViewedBook() {
        return viewedBook;
    }

    public Book[][] getBookListByName() {
        return bookListByName;
    }

    public Book[][] getBookListByAuthor() {
        return bookListByAuthor;
    }

    public Book[][] getBookListByGenre() {
        return bookListByGenre;
    }

    public void addBookToCatalog(Book book) {

        int charPos = getCharPosition(String.valueOf(book.getName()));

        for (int i = 0; i < bookListByName[charPos].length; i++) {
            if(bookListByName[charPos][i] == null) {
                bookListByName[charPos][i] = book;
                if (i >= bookListByName[charPos].length * 0.8){
                    increaseLibrary(bookListByName, i);
                }
                break;
            }
        }

        charPos = getCharPosition(String.valueOf(book.getAuthor()));

        for (int i = 0; i < bookListByAuthor[charPos].length; i++) {
            if(bookListByAuthor[charPos][i] == null) {
                bookListByAuthor[charPos][i] = book;
                if (i >= bookListByAuthor[charPos].length * 0.8){
                    increaseLibrary(bookListByAuthor, i);
                }
                break;
            }
        }

        charPos = getCharPosition(String.valueOf(book.getGenre()));

        for (int i = 0; i < bookListByGenre[charPos].length; i++) {
            if(bookListByGenre[charPos][i] == null) {
                bookListByGenre[charPos][i] = book;
                if (i >= bookListByGenre[charPos].length * 0.8){
                    increaseLibrary(bookListByGenre, i);
                }
                break;
            }
        }
    }

    public int getCharPosition(String str) {

        for (int i = 0; i < abc.length(); i ++) {

            if (abc.substring(i, i + 1).equalsIgnoreCase(str.substring(0, 1))) {
                return i;
            }
        }
        return 0;
    }
    public void increaseLibrary(Book[][] bookList, int j) {

        Book[][] bookList2 = new Book[j][bookList.length * 2];
        System.arraycopy(bookList[j], 0, bookList2[j], 0, bookList[j].length);
        bookList = bookList2;
    }

    public Book searchByName(String name) {

        int indexFirstLetter = getCharPosition(name);

        if (bookListByName[indexFirstLetter] != null) {
            for (int i = 0; i < bookListByName[indexFirstLetter].length; i++) {
                if (bookListByName[indexFirstLetter][i] != null &&
                        bookListByName[indexFirstLetter][i].getName().compareToIgnoreCase(name) == 0) {
                    return bookListByName[indexFirstLetter][i];
                }
            }
        }
        System.out.println("Enter another author name");
        return null;
    }

    public Book searchByAuthor(String name) {

        int indexFirstLetter = getCharPosition(name);

        if (bookListByAuthor[indexFirstLetter] != null) {
            for (int i = 0; i < bookListByAuthor[indexFirstLetter].length; i++) {
                if (bookListByAuthor[indexFirstLetter][i] != null &&
                        bookListByAuthor[indexFirstLetter][i].getAuthor().compareToIgnoreCase(name) == 0) {
                    return bookListByAuthor[indexFirstLetter][i];
                }
            }
        }
        System.out.println("Enter another author name");
        return null;
    }

    public Book[] searchByGenre(Genre genre) {

        Book[] boolListByGenre = new Book[5];
        String strGenre = String.valueOf(genre);
        int indexFirstLetter = getCharPosition(strGenre);

        for (int i = viewedBook, j = 0; i < bookListByGenre[indexFirstLetter].length && j < 5; i++) {
            if (String.valueOf(bookListByGenre[indexFirstLetter][i]) !=null &&
                    String.valueOf(bookListByGenre[indexFirstLetter][i].getGenre()).compareToIgnoreCase(strGenre) == 0)
            {
                boolListByGenre[j] = bookListByGenre[indexFirstLetter][i];
                j++;
                viewedBook++;
                if ((viewedBook + 1) % 5 == 0) break;
            }
        }
        return boolListByGenre;
    }

    public void printBook(Book book) {

        if (book != null) {
            System.out.println(book.getName() + " " + book.getAuthor() + " " + book.getGenre());
        }
    }
}


