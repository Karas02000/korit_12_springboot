package com.todolist.demo.repository;

import com.todolist.demo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "todos")
public interface TodoRepository extends JpaRepository <Todo, Long> {
    List<Todo> findByContent(@Param("content")  String content);
    List<Todo> findByIsComplete(@Param("isComplete") Boolean isComplete);
}