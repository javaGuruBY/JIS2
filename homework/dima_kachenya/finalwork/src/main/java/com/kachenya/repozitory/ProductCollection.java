package com.kachenya.repozitory;

import com.kachenya.been.Product;
import com.kachenya.enumes.Category;
import com.kachenya.interfaces.Addable;
import com.kachenya.service.ProductService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;

public class ProductCollection<T extends Product> implements Addable<T> {

    private Map<Long,T> stock=new HashMap<Long,T>();

    public Map<Long, T> getStock() {
        return stock;
    }

    public void setStock(HashMap<Long, T> stock) {
        this.stock = stock;
    }

    @Override
    public void add(T product) {
        stock.put(product.getId(),product);
    }

    @Override
    public void addMore(HashMap<Long,T> stock){
        this.stock.putAll(stock);
    }

    @Override
    public void removeById(long id) {
        stock.remove(id);
    }

    @Override
    public void removeAll() {
        stock.clear();
    }

    @Override
    public void printAllProducts() {
        for (T item:
             stock.values()) {
            System.out.println(
                    item.toString()
            );
        }
    }

    @Override
    public T findeById(Long id) {
        return stock.get(id);
    }

    @Override
    public List<T> findAllByCategory(Category category) {
        List<T> foundByCategory=new LinkedList<>();
        for (T item:
             stock.values()) {
            if(item.getCategory().equals(category)){
                foundByCategory.add(item);
            }
        }
        return foundByCategory;
    }

    @Override
    public void setDiscontAllProductCertainCategory(Category category, BigDecimal discount) {
        for (T item:
                stock.values()) {
            if(item.getCategory().equals(category)){
                ProductService.addDiscount(discount,item);
            }
        }
    }

}
