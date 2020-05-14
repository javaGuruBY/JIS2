package by.seven.service;

import by.seven.bean.Book;

public class BookService implements Runnable {

    @Override
    public void run() {
        Book book1 = new Book("Ремарк", "Три Товарища", 450);
        Book book2 = new Book("Брэдбери", "Вино из одуванчиков", 527);
        Book book3 = new Book("Ремарк", "Три Товарища", 450);

        System.out.println("book1 == book2 = " + (book1 == book2));
        System.out.println("book1 == book3 = " + (book1 == book3));
        System.out.println("book1.equals(book3) = " + book1.equals(book3));
        System.out.println("book1.equals(book2) = " + book1.equals(book2));
    }
}
