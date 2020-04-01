package by.serg.service;

import by.serg.bean.Book;

import java.util.HashSet;
import java.util.Set;

public class Library {
    private Set<Book> library = new HashSet<>();

    public void addBook(Book book) {
        library.add(book);
    }

    public void deleteBook(Book book) {
        library.remove(book);
    }

    public Book findByName(String name) {
        for (Book book: library) {
            if(book.getName().equals(name)) {
                return book;
            }
        }
        return null;
    }

    public Book[] findByAuthor(String author) {
        int arrayRangeCounter = 0;
        for (Book book: library) {
            if(book.getAuthor().equals(author)) {
                arrayRangeCounter++;
            }
        }
        Book[] bookArray = new Book[arrayRangeCounter];
        int counter = 0;
        for (Book book: library) {
            if(book.getAuthor().equals(author)) {
                bookArray[counter] = book;
                counter++;
            }
        }
        return bookArray;
    }
}
