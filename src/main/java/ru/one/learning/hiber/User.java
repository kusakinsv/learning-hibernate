package ru.one.learning.hiber;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 11)
    private long id;

    @Column(name = "age")
    private int age;
    @Column(name = "firstname", length = 50)
    private String firstname;

    private String lastname;

    @ManyToOne
    @JoinColumn(name = "roles_id")
    private Role role;

    public User() {
    }

    public User(long id) {
        this.id = id;
    }
}
