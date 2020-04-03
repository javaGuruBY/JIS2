package by.evgKor.hw5Task2.service;

import by.evgKor.hw5Task2.bean.Book;

public class BookService implements Runnable {
    @Override
    public void run() {
        Book bookNumOne=new Book("Lev Tolstoi","War and Peace",1200);
        Book bookNumTwo=new Book("Lev Tolstoi","War and Peace",1200);
        System.out.println("bookNumOne==bookNumOne = "+(bookNumOne==bookNumOne));
        System.out.println("bookNumOne==bookNumTwo = "+(bookNumOne==bookNumTwo));
        System.out.println("bookNumOne.equals(bookNumOne) = "+bookNumOne.equals(bookNumOne));
        System.out.println("bookNumOne.equals(bookNumTwo) = "+bookNumOne.equals(bookNumTwo));

    }
}
