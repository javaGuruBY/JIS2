package com.kachenya;

import com.kachenya.book.Book;
import com.kachenya.book.BookRepository;
import com.kachenya.customExeprion.ItemNotFoundExeption;

import java.util.List;

public class Main {
    public static void main(String[] args) throws ItemNotFoundExeption {
        BookRepository myLibrary=new BookRepository();
        myLibrary.save(new Book("1","Dima1","Kachenya",1000));
        myLibrary.save(new Book("2","Dima2","Kachenya",1000));
        myLibrary.save(new Book("3","Dima3","Kachenya",1000));
        myLibrary.save(new Book("4","Dima4","Kachenya",1000));
        myLibrary.save(new Book("5","Dima5","Kachenya",1000));
        myLibrary.save(new Book("6","Dima6","Kachenya",1000));
        myLibrary.save(new Book("7","Dima7","Kachenya",1000));
       // System.out.println(myLibrary.findById("10"));
        myLibrary.delete("2");
     //   myLibrary.findById("2");
        List<Book> myLsit=myLibrary.findAll();
        myLsit.forEach(System.out::println);
    }
}
