package by.evgKor.service;

import by.evgKor.bean.Book;

import java.util.HashSet;
import java.util.Set;

public class Library implements Runnable {

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

    public Book findBookByAuthor(String author){
        for (Book authors : libraryEx
        ) {
            if (authors.getBookAuthor().equals(author)) {
                return authors;
            }
        }
        return null;
    }

    @Override
    public void run() {
        Book bookOne = new Book("Lev Tolstoy", "War and Peace");
        Book bookTwo = new Book("Lev Tolstoy", "Anna Karenina");
        Book bookThree = new Book("Vladimir Mayakovsky", "Pro eto");
        Book bookFour = new Book("James Joyce", "Ulysses");
        Library library = new Library();
        library.addBook(bookOne);
        library.addBook(bookTwo);
        library.addBook(bookThree);
        library.addBook(bookFour);
        library.deleteBookFromLibrary(bookTwo);
        System.out.println(library.findOneBookByTitle("Ulysses"));
        System.out.println(library.findBookByAuthor("Lev Tolstoy"));
    }
}
