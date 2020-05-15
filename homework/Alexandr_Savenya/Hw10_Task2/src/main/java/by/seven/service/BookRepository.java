package by.seven.service;

import by.seven.bean.Book;
import by.seven.exception.ItemNotFoundException;
import by.seven.interfaces.Repository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BookRepository<E extends Book> implements Repository {
    Map<String, Book> bookMap = new HashMap<>();


    @Override
    public List findAll() {
        List<Book> list = new LinkedList<>();
        for (Book book: bookMap.values() ) {
            list.add(book);
        }
        System.out.println("All books in repositoty: " + list);
        return list;
    }

    @Override
    public Book findById(String id) throws ItemNotFoundException {
        if (bookMap.get(id) == null) {
            throw new ItemNotFoundException("Not found");
        } else {
            System.out.println("Find book by id:" + bookMap.get(id));
            return null;
        }
    }

    @Override
    public void save(Book item) {
        bookMap.put(item.getId(), item);
        System.out.println(item);
    }

    @Override
    public void delete(String id) throws ItemNotFoundException {
        if (bookMap.get(id) == null) {
            throw new ItemNotFoundException("Not found");
        } else {
            bookMap.remove(id);
            System.out.println("Removing: " + bookMap);
        }

    }
}
