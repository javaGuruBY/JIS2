package com.kachenya.been;

import com.kachenya.enumes.Category;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Product implements Serializable {
    private String name;
    private static  long ID=0;
    private long id=ID;
    private BigDecimal price;
    private Category category;
    private BigDecimal discount;
    private String description;
    private BigDecimal actualPrice;

    public Product() {
        name="";
        price=new BigDecimal(0);
        category=Category.FRUIT;
        discount=new BigDecimal(0);
        description="";
        actualPrice=new BigDecimal(0);
        ID++;
    }

    public Product(String name, BigDecimal price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
        discount=new BigDecimal(0);
        description="";
        actualPrice=new BigDecimal(0);
        ID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price.setScale(2,RoundingMode.HALF_UP);
    }

    public void setPrice(BigDecimal price) {
        this.price = price.setScale(2, RoundingMode.HALF_UP);
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount.setScale(2,RoundingMode.HALF_UP);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice.setScale(2,RoundingMode.HALF_UP);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return  Objects.equals(name, product.name) &&
                Objects.equals(price, product.price) &&
                category == product.category &&
                Objects.equals(discount, product.discount) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, price, category, discount, description);
    }

    @Override
    public String toString() {

        String productInfo= "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", category=" + category ;

        if(getDiscount().compareTo(new BigDecimal(0))>0){
            productInfo+=", discount= "+getDiscount().multiply(new BigDecimal(100))+
                    "%, actualPrice= "+getActualPrice();
        }
        if(getDescription()!=""){
            productInfo+=", discription= "+getDescription();
        }
        productInfo+=" }";
        return productInfo;
    }

}
