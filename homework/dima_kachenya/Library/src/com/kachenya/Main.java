package com.kachenya;

import com.kachenya.library.Library;
import com.kachenya.library.book.Book;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        myLibrary.add(new Book("Kachenya", "Some"));
        myLibrary.add(new Book("Kachenya", "Ovod"));
        myLibrary.add(new Book("Kachan", "Luntik"));
        myLibrary.add(new Book("Kachan", "Cheburashka"));
        myLibrary.add(new Book("Kachan", "Chipolino"));
        myLibrary.printAll();
        myLibrary.removeBook(new Book("Kachenya", "Some"));
        myLibrary.printAll();

        System.out.println(myLibrary.findeBookByBookName("Ovod").toString());
        System.out.println();
        System.out.println();
        System.out.println();

        Library myReturnLibrary = new Library();
        myReturnLibrary.myLibrary = myLibrary.returnAllBookByAuthor("Kachan");

        myReturnLibrary.printAll();


    }
}
