package by.lukash.Library.bean;

import java.util.HashSet;
import java.util.Set;

import by.lukash.Library.bean.Book;

public class Library {

    protected Set<Book> library = new HashSet<>();

    public void addBook(Book book) {
        library.add(book);
        System.out.println(book);
    }

    public void deleteBook(Book book) {
        library.remove(book);
    }

    public Book findBookByName(String name) {
        for (Book books : library) {
            if (books.getBookName().equals(books)) {
                return books;
            }
        }
        return null;
    }

    public Book findBookByAuthor(String author) {
        for (Book authors : library) {
            if (authors.getBookAuthor().equals(author)) {
                return authors;
            }
        }
        return null;
    }
}
