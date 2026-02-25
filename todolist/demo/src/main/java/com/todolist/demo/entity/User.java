package com.todolist.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Setter @NonNull
    private String username;
    @Setter @NonNull
    private String password;
    @Setter @NonNull
    private String role;

    @Setter @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Todo> todos;
}
