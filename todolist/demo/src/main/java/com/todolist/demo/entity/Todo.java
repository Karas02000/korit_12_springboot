package com.todolist.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@Getter
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Setter @Column(nullable = false)
    private String content;

    @Setter
    private boolean isComplete;

    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "user_id") @NonNull @JsonIgnore
    private User user;

    public Todo(String content, User user) {
        this.content = content;
        this.user = user;
    }
}
