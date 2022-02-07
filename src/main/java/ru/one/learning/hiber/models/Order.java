package ru.one.learning.hiber.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "order")
public class Order extends Model{

    @ManyToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    @Column(name = "price")
    private BigDecimal price;

    private int count;

    @Column(name = "status")
    private boolean status;

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public Order() {
        super();
    }

    public Order(Long id) {
        super(id);
    }
}
