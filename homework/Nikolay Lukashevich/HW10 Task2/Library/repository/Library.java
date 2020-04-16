package by.lukash.Library.repository;

import java.util.*;


import by.lukash.Library.Exception.ItemNotFoundException;
import by.lukash.Library.bean.Book;
import by.lukash.Library.interfaces.Repository;

public class Library<E extends Book> implements Repository {

    Map<String, Book> bookList = new HashMap<>();

    @Override
    public List findAll() {
        List<Book> list = new LinkedList<>();
        for (Book book : bookList.values()) {
            list.add(book);
        }
        System.out.println("book was add to:" + list);
        return list;
    }

    @Override
    public Book findById(String id) throws ItemNotFoundException {
        if (bookList.get(id) == null) {
            throw new ItemNotFoundException("Book not found");
        }
        System.out.println("Find book by id" + id +": " + bookList.get(id));
        return null;
    }

    @Override
    public void save(Book item) {
        bookList.put(item.getId(), item);
        System.out.println(item);
    }

    @Override
    public void delete(String id) throws ItemNotFoundException {
        if (bookList.get(id) == null) {
            throw new ItemNotFoundException("Book not found");
        }
        bookList.remove(id);
        System.out.println("List after removing: \n" + bookList);
    }
}

