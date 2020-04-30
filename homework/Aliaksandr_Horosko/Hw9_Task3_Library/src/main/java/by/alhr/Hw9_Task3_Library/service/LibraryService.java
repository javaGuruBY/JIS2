package by.alhr.Hw9_Task3_Library.service;

import by.alhr.Hw9_Task3_Library.bean.Book;

import java.util.*;

public class LibraryService implements Runnable {

    protected Set<Book> librarySet = new HashSet<>();

    public void addBookInLibrary(Book book) {
        librarySet.add(book);
        System.out.println(book);
    }

    public void deleteBookFromLibrary(Book book) {
        System.out.println("\nColichestbo knig v biblioteke- " + librarySet.size());
        librarySet.remove(book);
        System.out.println("This book deleted: " + book);
        System.out.println("Colichestbo knig v biblioteke after remove - " + librarySet.size());
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


    @Override
    public void run() {
        Book book1 = new Book("Zelenaya Milya", "Stiven King");
        Book book2 = new Book("Umri Segodnya", "James Piter");
        Book book3 = new Book("Siyanie", "Stiven King");
        Book book4 = new Book("Vse krome pravdi", "Jillian Makkallister");
        Book book5 = new Book("Vse ", "Kto-to");
        Book book6 = new Book("Escho odna", "Jillian Makkallister");

        LibraryService library = new LibraryService();

        library.addBookInLibrary(book1);
        library.addBookInLibrary(book2);
        library.addBookInLibrary(book3);
        library.addBookInLibrary(book4);
        library.addBookInLibrary(book5);
        library.addBookInLibrary(book6);

        library.findByName("Umri Segodnya");
        library.findByAuthor("Jillian Makkallister");

        library.deleteBookFromLibrary(book3);
    }
}
