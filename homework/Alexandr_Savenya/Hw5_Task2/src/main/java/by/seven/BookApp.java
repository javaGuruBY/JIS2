package by.seven;

import by.seven.service.BookService;

public class BookApp {
    public static void main(String[] args) {
        Thread thread = new Thread(new BookService());
        thread.start();
    }
}
