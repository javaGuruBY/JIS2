package by.seven.interfaces;

import by.seven.bean.Book;
import by.seven.exception.ItemNotFoundException;

import java.util.List;

public interface Repository<T extends Book> {

    List<T>  findAll();
    T findById(String id) throws ItemNotFoundException;
    void save(T item);
    void delete(String id) throws ItemNotFoundException;
}
