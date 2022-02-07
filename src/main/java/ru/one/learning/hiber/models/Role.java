package ru.one.learning.hiber.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "roles")
public class Role extends Model {

    @Column(name = "title")
    private String title;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Role() {
        super();
    }
}
