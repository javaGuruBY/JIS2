package by.seven;

import by.seven.bean.Book;
import by.seven.service.Library;

public class LibraryDemo {
    public static void main(String[] args) {
        Book book1 = new Book("3 comrade", "Erich Maria Remarque");
        Book book2 = new Book("To Kill a Mockingbird", "Nell Harper Lee");
        Book book3 = new Book("The Hobbit", "John Ronald Roel Tolkien");
        Library library = new Library();
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book3);
        library.findBookByName("3 comrade");
        library.deleteBookFromLibrary(book2);
        library.returnAllBooksByAuthor("John Ronald Roel Tolkien");
        library.findBookByName("To Kill a Mockingbird");


    }
}
