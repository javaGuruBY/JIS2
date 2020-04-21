package com.kachenya.interfaces;

import com.kachenya.been.Product;
import com.kachenya.enumes.Category;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

public interface Addable<T extends Product> {
    void add(T product);
    void addMore(HashMap<Long,T> stock);
    void removeById(long id);
    void removeAll();
    void printAllProducts();
    T findeById(Long id);
    List<T> findAllByCategory(Category category);
    void setDiscontAllProductCertainCategory(Category category, BigDecimal discount);
}
