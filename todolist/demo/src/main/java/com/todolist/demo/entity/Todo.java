package com.todolist.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Setter @NonNull @Schema(description = "할 일 내용", example = "SQLD 공부하기")
    private String content;

    @Setter @NonNull @Schema(description = "완료 여부")
    private boolean isComplete = false;

    @ManyToOne @JoinColumn(name = "user") @NonNull @JsonIgnore
    private User user;
}
