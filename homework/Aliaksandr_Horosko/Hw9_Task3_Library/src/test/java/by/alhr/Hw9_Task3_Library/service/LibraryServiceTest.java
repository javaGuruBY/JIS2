package by.alhr.Hw9_Task3_Library.service;

import by.alhr.Hw9_Task3_Library.bean.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryServiceTest {

    public void addBookInLibrary() {

        LibraryService libraryServiceTest = new LibraryService();
        Set<Book> librarySetTest = new HashSet<>();

        Book bookTest1 = new Book("1", "1.1");
        Book bookTest2 = new Book("2", "2.2");

        librarySetTest.add(bookTest1);
        librarySetTest.add(bookTest2);

        libraryServiceTest.addBookInLibrary(bookTest1);
        libraryServiceTest.addBookInLibrary(bookTest2);

        assertEquals(librarySetTest, libraryServiceTest.librarySet);
    }

    @Test
    public void deleteBookFromLibrary() {
        LibraryService libraryServiceTest = new LibraryService();
        Set<Book> librarySetTest = new HashSet<>();

        Book bookTest1 = new Book("1", "1.1");
        Book bookTest2 = new Book("2", "2.2");

        libraryServiceTest.addBookInLibrary(bookTest1);
        libraryServiceTest.addBookInLibrary(bookTest2);

        librarySetTest.remove(bookTest1);
        libraryServiceTest.deleteBookFromLibrary(bookTest1);

        assertEquals(1, libraryServiceTest.librarySet.size());
    }

    @Test
    public void findByName() {
        LibraryService libraryServiceTest = new LibraryService();
        Set<Book> librarySetTest = new HashSet<>();

        Book bookTest1 = new Book("1", "1.1");
        Book bookTest2 = new Book("2", "2.2");
        Book bookTest3 = new Book("3", "1.1");

        libraryServiceTest.addBookInLibrary(bookTest1);
        libraryServiceTest.addBookInLibrary(bookTest2);
        libraryServiceTest.addBookInLibrary(bookTest3);

        assertEquals(bookTest2, libraryServiceTest.findByName("2"));
    }

    @Test
    public void findByAuthor() {
        LibraryService libraryServiceTest = new LibraryService();
        List<Book> bookFindByAuthorTest = new LinkedList<>();

        Book bookTest1 = new Book("1", "1.1");
        Book bookTest2 = new Book("2", "2.2");
        Book bookTest3 = new Book("3", "1.1");

        bookFindByAuthorTest.add(bookTest3);
        bookFindByAuthorTest.add(bookTest1);

        libraryServiceTest.addBookInLibrary(bookTest1);
        libraryServiceTest.addBookInLibrary(bookTest2);
        libraryServiceTest.addBookInLibrary(bookTest3);

        assertEquals(bookFindByAuthorTest, libraryServiceTest.findByAuthor("1.1"));
    }
}