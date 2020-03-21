package by.alhr.Hw5_task2_book.service;

import by.alhr.Hw5_task2_book.main.Book;

public class BookService implements Runnable {
    @Override
    public void run() {
        Book book1 = new Book("author1", "name1", 527);
        Book book2 = new Book("author1", "name1", 527);

        System.out.println("book1 == book1 = " + (book1 == book1));
        System.out.println("book1 == book2 = " + (book1 == book2));
        System.out.println("book1.equals(book1) = " + book1.equals(book1));
        System.out.println("book1.equals(book2) = " + book1.equals(book2));


    }
}
