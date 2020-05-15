package by.seven.service;

import by.seven.bean.Book;

import java.util.HashSet;
import java.util.Set;

public class Library {
    protected Set<Book> libraryStorage = new HashSet<>();

    public void addBookToLibrary(Book book) {
        libraryStorage.add(book);
        System.out.println(book + "added to Library;");
    }

    public void deleteBookFromLibrary(Book book) {
        libraryStorage.remove(book);
        System.out.println(book + "deleted from Library;");
    }

    public Book findBookByName(String name) {
        for(Book books: libraryStorage) {
            if (books. getName().equals(name)){
                System.out.println("Name" + name  + "Found: " + books);
                return books;
            }
        } return null;

    }

    public Object returnAllBooksByAuthor(String author) {
        for (Book books: libraryStorage) {
            if (books.getAuthor().equals(author)) {
                System.out.println("Author:" + author + " found:" + books);
                return books;
            }
        }return null;

    }
}

