package by.serg;

import by.serg.bean.Book;
import by.serg.service.Library;

import java.util.Arrays;

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Декамерон","Боккаччо Джованни");
        Book book2 = new Book("Witcher", "Anjey Sapkowski");
        Book book3 = new Book("Fellowship of the Ring", "J.J. Tolkin");
        Book book4 = new Book("Two towers", "J.J. Tolkin");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        System.out.println(library.findByName("Two towers"));
        System.out.println(Arrays.toString(library.findByAuthor("J.J. Tolkin")));
        library.deleteBook(book4);
        System.out.println(Arrays.toString(library.findByAuthor("J.J. Tolkin")));
    }
}
