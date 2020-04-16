package by.lukash.Library.interfaces;

import by.lukash.Library.Exception.ItemNotFoundException;
import by.lukash.Library.bean.Book;

import java.util.List;

public interface Repository<T extends Book> {
    List<T> findAll();
    T findById(String id) throws ItemNotFoundException;
    void save(T item);
    void delete(String id) throws ItemNotFoundException;
}
