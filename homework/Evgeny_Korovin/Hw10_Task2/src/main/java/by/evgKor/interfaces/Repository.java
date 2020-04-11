package by.evgKor.interfaces;

import by.evgKor.bean.Book;
import by.evgKor.exceptions.ItemNotFoundException;

import java.util.List;

public interface Repository<T extends Book> {

    List<T> findAll();

    T findById(String id) throws ItemNotFoundException;

    void save(T item);

    void delete(String id) throws ItemNotFoundException;
}
