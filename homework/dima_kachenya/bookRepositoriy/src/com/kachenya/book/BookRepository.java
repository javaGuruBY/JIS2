package com.kachenya.book;

import com.kachenya.customExeprion.ItemNotFoundExeption;
import com.kachenya.repository.Repository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class BookRepository<E extends Book> implements Repository {
    HashMap<String, Book> myCollection = new HashMap();

    @Override
    public List findAll() {
        List<Book> myList = new LinkedList<>();
        for (Book item :
                myCollection.values()) {
            myList.add(item);
        }

        return myList;
    }

    @Override
    public Book findById(String id) throws ItemNotFoundExeption {
        if (myCollection.isEmpty()) {
            throw new ItemNotFoundExeption("Map is empty");
        }
        boolean haveKey = false;
        for (String item :
                myCollection.keySet()) {
            if (id.equals(item)) {
                haveKey = true;
            }
        }
        if (!haveKey) {
            throw new ItemNotFoundExeption("Key not found");
        }
        return myCollection.get(id);
    }

    @Override
    public void save(Book item) {
        myCollection.put(item.getId(), item);

    }

    @Override
    public void delete(String id) throws ItemNotFoundExeption {
        boolean haveKey = false;
        for (String item :
                myCollection.keySet()) {
            if (id.equals(item)) {
                haveKey = true;
            }
        }
        if (!haveKey) {
            throw new ItemNotFoundExeption("Key not found");
        }
        myCollection.remove(id);
    }
}
