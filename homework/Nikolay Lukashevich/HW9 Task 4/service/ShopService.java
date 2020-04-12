package by.lukash.Shop.service;

import by.lukash.Shop.bean.Product;
import by.lukash.Shop.interfaces.RepositoryInterface;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class ShopService {

    Set<Product> shopService =new HashSet<>();
    private RepositoryInterface products;

    public void addProduct(Product product){
        shopService.add(product);
        System.out.println(product);
    }

    public void deleteProduct(Product product){
        shopService.remove(product);
        System.out.println(product);
    }

    public Product searchProductByName(String name){
        for (Product products:shopService) {
            if (products.getName().equals(name)){
                System.out.println(products);
            }
        }
        return null;
    }

    public Set<Product> findProductByPriceRange(BigDecimal minPriceRange, BigDecimal maxPriceRange){
        Set<Product> productList=new HashSet<>();
        for (Product productByPriceRange:shopService) {
            if (productByPriceRange.getPrice().compareTo(minPriceRange) == 1
                    && productByPriceRange.getPrice().compareTo(maxPriceRange) == -1) {
                System.out.println(productByPriceRange);
            }
        }
        return productList;
    }

}
