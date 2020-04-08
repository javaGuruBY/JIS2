package by.serg.interfaces;

import by.serg.bean.Book;
import by.serg.exceptions.ItemNotFoundException;

import java.util.List;

public interface Repository<T extends Book> {

    List<T> findAll();

    T findById(String id) throws ItemNotFoundException;

    void save(T item);

    void delete(String id) throws ItemNotFoundException;
}
