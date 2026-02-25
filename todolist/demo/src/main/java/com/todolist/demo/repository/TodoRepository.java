package com.todolist.demo.repository;

import com.todolist.demo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TodoRepository extends JpaRepository <Todo, Long> {
    List<Todo> findByIsContent(@Param("content")  String content);
    List<Todo> findByIsComplete(@Param("isComplete") Boolean isComplete);
}