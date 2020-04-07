package com.kachenya.repository;

import com.kachenya.book.Book;
import com.kachenya.customExeprion.ItemNotFoundExeption;

import java.util.List;

public interface Repository<T extends Book> {
    List<T> findAll();
    T findById(String id)throws ItemNotFoundExeption;
    void save(T item);
    void delete(String id)throws ItemNotFoundExeption;
}
