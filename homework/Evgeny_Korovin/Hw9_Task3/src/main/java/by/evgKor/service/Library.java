package by.evgKor.service;

import by.evgKor.bean.Book;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Library {

    protected Set<Book> libraryEx = new HashSet<>();

    public void addBook(Book book) {
        libraryEx.add(book);
        System.out.println(book);
    }

    public void deleteBookFromLibrary(Book book) {
        libraryEx.remove(book);
        System.out.println("List after removing ");
        System.out.println(libraryEx);
    }

    public Book findOneBookByTitle(String name) {
        for (Book books : libraryEx) {
            if (books.getBookName().equals(name)) {
                return books;
            }
        }
        return null;
    }

    public List<Book> findBookByAuthor(String bookAuthor) {
        List<Book> bookList = new LinkedList<>();
        for (Book booksByAuthor : libraryEx) {
            if (booksByAuthor.getBookAuthor().equals(bookAuthor)) {
                bookList.add(booksByAuthor);
            }
        }
        System.out.println("Books by author: " + "\n" + bookList);
        return bookList;
    }

}
