package by.evgKor;

import by.evgKor.bean.Book;
import by.evgKor.exceptions.ItemNotFoundException;
import by.evgKor.service.BookRepositoryService;

public class Main {
    public static void main(String[] args) throws ItemNotFoundException {
        BookRepositoryService bookRepositoryService=new BookRepositoryService();
        bookRepositoryService.save(new Book("1","Harry Potter","Joanne Rowling",300));
        bookRepositoryService.save(new Book("2","Vedmak","Andjei Sapkovsky",530));
        bookRepositoryService.findAll();
        bookRepositoryService.findById("2");
        bookRepositoryService.delete("4");
    }
}
