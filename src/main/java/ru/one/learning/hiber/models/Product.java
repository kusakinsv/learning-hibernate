package ru.one.learning.hiber.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@Entity
@Table(name = "product")
public class Product extends Model {

    private String title;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_category_id", referencedColumnName = "id")
    private ProductCategory productCategory;

    private BigDecimal price;

    public Product(Long id) {
        super(id);
    }

    public Product() {
        super();
    }

}
