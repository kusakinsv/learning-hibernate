package ru.one.learning.hiber;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
public class User implements Serializable {

    private long id;

    private int age;

    private String firstname;

    private String lastname;

    private Set<Role> roles;

    public User() {
    }

    public User(long id) {
        this.id = id;
    }
}
