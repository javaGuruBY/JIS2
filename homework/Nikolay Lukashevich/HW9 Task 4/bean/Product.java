package by.lukash.Shop.bean;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString


public class Product extends Entity implements Serializable {
    private String name;
    private BigDecimal price;

    public Product(Integer id, String name, BigDecimal price) {
        super(id);
        this.name = name;
        this.price = price;
    }
}
