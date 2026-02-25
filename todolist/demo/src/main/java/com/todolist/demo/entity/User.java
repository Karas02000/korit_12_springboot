package com.todolist.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Setter @Column(nullable = false, unique = true)
    private String username;
    @Setter @Column(nullable = false)
    private String password;
    @Setter @Column(nullable = false)
    private String role;
    @Setter @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Todo> todos;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}
