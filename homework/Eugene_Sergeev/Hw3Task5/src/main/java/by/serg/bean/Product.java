package by.serg.bean;

import java.util.Objects;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if (discount >= 0 && discount <= 100) {
            this.discount = discount;
        } else {
            System.out.println("Discount have to be from 0 to 100");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.regularPrice, regularPrice) == 0 &&
                Double.compare(product.discount, discount) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, regularPrice, discount);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", regularPrice=" + regularPrice +
                ", discount=" + discount +
                '}';
    }
}
