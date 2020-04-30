package by.alhr.Hw9_Task3_Library.service;

import by.alhr.Hw9_Task3_Library.bean.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryServiceTest {

    @Test
    public void addBookInLibrary() {

        LibraryService libraryService = new LibraryService();
        Set<Book> librarySetTest = new HashSet<>();

        Book bookTest1 = new Book("1", "1.1");
        Book bookTest2 = new Book("2", "2.2");

        librarySetTest.add(bookTest1);
        librarySetTest.add(bookTest2);

        libraryService.addBookInLibrary(bookTest1);
        libraryService.addBookInLibrary(bookTest2);

        assertEquals(librarySetTest, libraryService.librarySet);
    }

    @Test
    public void deleteBookFromLibrary() {
        LibraryService libraryService = new LibraryService();
        Set<Book> librarySetTest = new HashSet<>();

        Book bookTest1 = new Book("1", "1.1");
        Book bookTest2 = new Book("2", "2.2");

        librarySetTest.add(bookTest1);
        librarySetTest.add(bookTest2);

        libraryService.addBookInLibrary(bookTest1);
        libraryService.addBookInLibrary(bookTest2);

        librarySetTest.remove(bookTest1);
        libraryService.deleteBookFromLibrary(bookTest1);

        assertEquals(1, libraryService.librarySet.size());
    }

    @Test
    public void findByName() {
        LibraryService libraryService = new LibraryService();
        Set<Book> librarySetTest = new HashSet<>();

        Book bookTest1 = new Book("1", "1.1");
        Book bookTest2 = new Book("2", "2.2");
        Book bookTest3 = new Book("3", "1.1");

        librarySetTest.add(bookTest1);
        librarySetTest.add(bookTest2);
        librarySetTest.add(bookTest3);

        libraryService.addBookInLibrary(bookTest1);
        libraryService.addBookInLibrary(bookTest2);
        libraryService.addBookInLibrary(bookTest3);

        assertEquals(bookTest2, libraryService.findByName("2"));
    }

    @Test
    public void findByAuthor() {
//        LibraryService libraryService = new LibraryService();
//        Set<Book> librarySetTest = new HashSet<>();
//
//
//        Book bookTest1 = new Book("1", "1.1");
//        Book bookTest2 = new Book("2", "2.2");
//        Book bookTest3 = new Book("3", "1.1");
//
//
//        librarySetTest.add(bookTest1);
//        librarySetTest.add(bookTest2);
//        librarySetTest.add(bookTest3);
//
//        libraryService.addBookInLibrary(bookTest1);
//        libraryService.addBookInLibrary(bookTest2);
//        libraryService.addBookInLibrary(bookTest3);
//
//        libraryService.librarySet=librarySetTest;
//        libraryService.equals(librarySetTest);
//
//        String expected = ;
//        String actual ="1.1";
//
//
//        assertEquals("[Book (name: 3, author: 1.1), Book (name: 1, author: 1.1)]", libraryService.findByAuthor(actual));
    }
}