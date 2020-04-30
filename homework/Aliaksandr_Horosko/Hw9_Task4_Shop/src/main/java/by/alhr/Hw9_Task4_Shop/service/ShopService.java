package by.alhr.Hw9_Task4_Shop.service;

import by.alhr.Hw9_Task4_Shop.bean.Product;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class ShopService implements Runnable{
    Set<Product> shopServiceSet=new HashSet<>();

    public void addProduct(Product product){
        shopServiceSet.add(product);
        System.out.println(product);
    }

    public void deleteProduct(Product product){
        shopServiceSet.remove(product);
        System.out.println("\nProduct which was been removed");
        System.out.println(product);
    }

    public Product searchProductByName(String name){
        for (Product products:shopServiceSet) {
            if (products.getProductName().equals(name)){
                System.out.println("\nsearchProductByName: "+products);
            }
        }
        return null;
    }

    public Set<Product> findProductByPriceRange(BigDecimal minPriceRange, BigDecimal maxPriceRange){
        Set<Product> productList=new HashSet<>();
        System.out.println("\nfindProductByPriceRange: ");
        for (Product productByPriceRange:shopServiceSet) {
            if (productByPriceRange.getPrice().compareTo(minPriceRange) == 1
                    && productByPriceRange.getPrice().compareTo(maxPriceRange) == -1) {
                System.out.println(productByPriceRange);
            }
        }
        return productList;
    }

    @Override
    public void run() {
        Product product1=new Product("Beer",new BigDecimal("9.15"));
        Product product2=new Product("Hleb",new BigDecimal("0.158"));
        Product product3=new Product("Salo",new BigDecimal("12.0"));
        Product product4=new Product("Maslo",new BigDecimal("10.11"));
        ShopService shopService=new ShopService();
        shopService.addProduct(product1);
        shopService.addProduct(product2);
        shopService.addProduct(product3);
        shopService.addProduct(product4);
        shopService.searchProductByName("Salo");
        shopService.findProductByPriceRange(new BigDecimal(6.0),new BigDecimal(11.0));
        shopService.deleteProduct(product2);
    }
}
