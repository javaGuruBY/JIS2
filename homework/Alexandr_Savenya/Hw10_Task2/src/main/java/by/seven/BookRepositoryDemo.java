package by.seven;

import by.seven.bean.Book;
import by.seven.exception.ItemNotFoundException;
import by.seven.service.BookRepository;

public class BookRepositoryDemo {
    public static void main(String[] args) throws ItemNotFoundException {
        BookRepository bookRepository = new BookRepository();
        bookRepository.save(new Book("1","The Complete Stories","Flannery O'Connor",315));
        bookRepository.save(new Book("2", "The French Laundry Cookbook", "Thomas Keller",218));
        bookRepository.save(new Book("3","When Breath Becomes Air","Paul Kalanithi",14));
        bookRepository.findAll();
        bookRepository.delete("2");
        bookRepository.findById("3");
    }
}
