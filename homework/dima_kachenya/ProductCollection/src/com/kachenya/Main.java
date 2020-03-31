package com.kachenya;

import com.kachenya.shop.Shop;
import com.kachenya.shop.product.Product;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Shop myShop=new Shop();
        myShop.add(new Product("Макароны",new BigDecimal(2.4)));
        myShop.add(new Product("Пельмени",new BigDecimal(5)));
        myShop.add(new Product("Гречка",new BigDecimal(1.2)));
        myShop.add(new Product("Колбоса",new BigDecimal(6)));
      //  System.out.println(myShop.findProductByName("Колбоса"));
        myShop.removeProduct(new Product("Колбоса",new BigDecimal(6)));
       // System.out.println(myShop.findProductByName("Колбоса"));

        Shop myShop2=new Shop();
        myShop2.myShop=myShop.findProduct(new BigDecimal(1),new BigDecimal(5));
        myShop2.printAll();



    }
}
