package by.alhr.Hw9_Task3_Library.service;

import by.alhr.Hw9_Task3_Library.bean.Book;

import java.util.*;

public class LibraryService {

    protected Set<Book> librarySet = new HashSet<>();

    public void addBookInLibrary(Book book) {
        librarySet.add(book);
        System.out.println(book);
    }

    public void deleteBookFromLibrary(Book book) {
        System.out.println("\nColichestbo knig v biblioteke = " + librarySet.size());
        librarySet.remove(book);
        System.out.println("This book deleted: " + book);
        System.out.println("Colichestbo knig v biblioteke after remove = " + librarySet.size());
        System.out.println("Knigi kotorye ostalis: " + librarySet);
    }

    public Book findByName(String name) {
        for (Book book : librarySet) {
            if (book.getNameBook().equals(name)) {
                System.out.println("\nFindByName: " + book);
                return book;
            }
        }
        return null;
    }

    public List<Book> findByAuthor(String author) {
        List<Book> bookFindByAuthor = new LinkedList<>();
        for (Book authors : librarySet) {
            if (authors.getAuthor().equals(author)) {
                bookFindByAuthor.add(authors);
            }
        }
        System.out.println("\nFindByAuthor: " + "\n" + bookFindByAuthor);
        return bookFindByAuthor;
    }
}
