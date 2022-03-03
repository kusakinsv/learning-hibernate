package ru.one.learning.hiber.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
@Getter
@Setter
@Entity
@Table(name = "product")
public class Product extends Model {

    private String title;

    @Column(name = "[description]")
    private String description;

    @ManyToOne
    @JoinColumn(name = "product_category_id", referencedColumnName = "id")
    private ProductCategory productCategory;

    private BigDecimal price;

    public Product(Long id) {
        super(id);
    }

    public Product() {
        super();
    }

    @Override
    public String toString() {
        return String.format(
                "Product (title=%s, description=%s, price=%s)", this.title, this.description, this.price);
    }
}
