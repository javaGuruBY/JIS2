package by.evgKor.service;
import by.evgKor.bean.Product;
public class ProductService {
    Product product;
    public double actualPrice(Product product){
        return (product.getRegularPrice()-(product.getRegularPrice()*product.getDiscount())/100);
    }

    public void printInformation(Product product){
        System.out.println("Product: "+product.getName()+", Regular price: "
                +product.getRegularPrice()+" BYN, Discount: "+product.getDiscount()+" %, Actual price "+actualPrice(product)+" BYN");
    }

}
