package by.evgKor.service;

import by.evgKor.bean.Book;
import by.evgKor.exceptions.ItemNotFoundException;
import by.evgKor.interfaces.Repository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BookRepositoryService<E extends Book> implements Repository {

    Map<String, Book> bookList = new HashMap<>();

    @Override
    public List findAll() {
        List<Book> list = new LinkedList<>();
        for (Book book : bookList.values()) {
            list.add(book);
        }
        System.out.println("All books in the collections: \n" + list);
        return list;
    }

    @Override
    public Book findById(String id) throws ItemNotFoundException {
        if (bookList.get(id) == null) {
            throw new ItemNotFoundException("Book not found");
        }
        System.out.println("Book by id: " + bookList.get(id));
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
