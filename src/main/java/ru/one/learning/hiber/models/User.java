package ru.one.learning.hiber.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends Model {

    @Column(name = "age")
    private int age;
    @Column(name = "firstname", length = 50)
    private String firstname;

    private String lastname;

    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<Role> roles;

    public User() {
        super();
    }
}
