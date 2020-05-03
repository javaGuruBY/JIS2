package by.alhr.Hw10_Task2_SimpleDatabase.interfaces;

import by.alhr.Hw10_Task2_SimpleDatabase.bean.Book;
import by.alhr.Hw10_Task2_SimpleDatabase.exception.ItemNotFoundException;

import java.util.List;

public interface Repository<T extends Book> {

    List<T> findAll();

    T findById(String id) throws ItemNotFoundException;

    void save(T item);

    void delete(String id) throws ItemNotFoundException;
}
