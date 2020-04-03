package acya.ki.book.service;

import acya.ki.book.bean.Book;

public class BookService implements Runnable{

    @Override
    public void run() {
        Book bookOne = new Book("Michail Labkovskiy", "Xochy i budu", 345);
        System.out.println(bookOne);
        System.out.println(bookOne.hashCode());
        Book bookTwo = new Book(null, "lalala", 345);
        System.out.println(bookTwo);
        System.out.println(bookTwo.hashCode());
        System.out.println("bookOne == bookTwo = "+ bookOne.equals(bookTwo));
        bookTwo.setAuthor("Michail Labkovskiy");
        bookTwo.setName("Xochy i budu");
        System.out.println(bookTwo);
        System.out.println("bookOne == bookTwo = " + bookOne.equals(bookTwo));
        System.out.println(bookOne.hashCode());
        System.out.println(bookTwo.hashCode());
        }
}
