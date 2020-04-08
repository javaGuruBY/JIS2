package by.serg.service;

import by.serg.bean.Book;
import by.serg.exceptions.ItemNotFoundException;
import by.serg.interfaces.Repository;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class BookRepository<E extends Book> implements Repository {
    HashMap<String, Book> hashMap = new HashMap<>();

    @Override
    public List findAll() {
        List<Book> list = new LinkedList<>();
        for (Book book: hashMap.values()) {
            list.add(book);
        }
        return list;
    }

    @Override
    public Book findById(String id) throws ItemNotFoundException {
        if(hashMap.get(id) == null) {
            throw new ItemNotFoundException("Item not found");
        }
        return hashMap.get(id);
    }

    @Override
    public void save(Book item) {
        hashMap.put(item.getId(), item);
    }

    @Override
    public void delete(String id) throws ItemNotFoundException {
        if(hashMap.get(id) == null) {
            throw new ItemNotFoundException("Item not found");
        }
        hashMap.remove(id);
    }
}
