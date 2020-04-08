package by.evgKor.service;

import by.evgKor.bean.Product;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class ShopService implements Runnable {

    Set<Product> serviceEx=new HashSet<>();

    public void addProduct(Product product){
        serviceEx.add(product);
        System.out.println(product);
    }

    public void deleteProduct(Product product){
        serviceEx.remove(product);
        System.out.println("Show product that has been removed");
        System.out.println(product);
    }

    public Product searchProductByName(String name){
        for (Product products:serviceEx) {
            if (products.getProductName().equals(name)){
                System.out.println(products);
            }
        }
        return null;
    }

    public Set<Product> findProductByPriceRange(BigDecimal minPriceRange, BigDecimal maxPriceRange){
        Set<Product> productList=new HashSet<>();
        for (Product productByPriceRange:serviceEx) {
            if (productByPriceRange.getPrice().compareTo(minPriceRange) == 1
                    && productByPriceRange.getPrice().compareTo(maxPriceRange) == -1) {
                System.out.println(productByPriceRange);
            }

        }

        return productList;
    }

    @Override
    public void run() {
        Product product1=new Product("Beer",new BigDecimal("1.95"));
        Product product2=new Product("Crisps",new BigDecimal("3.75"));
        Product product3=new Product("Coca-Cola",new BigDecimal("2.15"));
        Product product4=new Product("Pizza",new BigDecimal("8.99"));
        ShopService shopService=new ShopService();
        shopService.addProduct(product1);
        shopService.addProduct(product2);
        shopService.addProduct(product3);
        shopService.addProduct(product4);
        shopService.searchProductByName("Beer");
        shopService.findProductByPriceRange(new BigDecimal(2.0),new BigDecimal(4.0));
        shopService.deleteProduct(product2);
    }
}
