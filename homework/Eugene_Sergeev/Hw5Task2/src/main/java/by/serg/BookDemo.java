package by.serg;

import by.serg.bean.Book;

public class BookDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new Book());
        thread.start();
    }
}
