package by.serg;

import by.serg.bean.Book;
import by.serg.exceptions.ItemNotFoundException;
import by.serg.service.BookRepository;

public class BookRepositoryDemo {
    public static void main(String[] args) throws ItemNotFoundException {
        BookRepository bookRepository = new BookRepository();
        bookRepository.save(new Book("1", "Lord of the Rings: Two Towers", "J.J.Tolkin", 348));
        System.out.println(bookRepository.findAll());
        System.out.println(bookRepository.findById("1"));
        bookRepository.delete("1");
        System.out.println(bookRepository.findAll());
        bookRepository.findById("1");
    }
}
