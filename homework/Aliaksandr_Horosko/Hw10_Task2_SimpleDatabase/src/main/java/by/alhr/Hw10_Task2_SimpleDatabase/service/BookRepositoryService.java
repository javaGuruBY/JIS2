package by.alhr.Hw10_Task2_SimpleDatabase.service;

import by.alhr.Hw10_Task2_SimpleDatabase.bean.Book;
import by.alhr.Hw10_Task2_SimpleDatabase.exception.ItemNotFoundException;
import by.alhr.Hw10_Task2_SimpleDatabase.interfaces.Repository;

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
            throw new ItemNotFoundException("Не найдена");
        }
        System.out.println("id книги: " + bookList.get(id));
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
            throw new ItemNotFoundException("Не найдена");
        }
        bookList.remove(id);
        System.out.println("После удаления: \n" + bookList);
    }
}
