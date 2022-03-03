package ru.one.learning.hiber.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "[user]")
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
    private Set<Role> roles = new HashSet<>();

    public User() {
        super();
    }
}
