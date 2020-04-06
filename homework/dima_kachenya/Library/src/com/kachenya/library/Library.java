package com.kachenya.library;

import com.kachenya.library.book.Book;

import java.util.LinkedList;

public class Library<T extends Book> {
    public LinkedList<T> myLibrary = new LinkedList<>();

    public Library() {
        myLibrary=new LinkedList<>();
    }

    public void add(T myBook) {
        myLibrary.add(myBook);
    }

    public void removeBook(T bookForRemove) {
        myLibrary.remove(bookForRemove);
    }

    public T findeBookByBookName(String bookName) {
        for (T item :
                myLibrary) {
            if (item.getBookName().equals(bookName)) {
                return item;
            }
        }
        System.out.println("Book is not found");
        return null;
    }
    public LinkedList<T> returnAllBookByAuthor(String authorNmae){
        LinkedList<T> myReturnBook=new LinkedList<>();
        for (T item :
                myLibrary) {
            if (item.getAuthor().equals(authorNmae)) {
                myReturnBook.add(item);
            }
        }
        return myReturnBook;
    }
    public void printAll(){
        System.out.println("______________________________________________________");
        for (T item:
             myLibrary) {
            System.out.println(item);
        }
        System.out.println("______________________________________________________");
    }

}
