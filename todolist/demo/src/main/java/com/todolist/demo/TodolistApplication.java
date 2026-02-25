package com.todolist.demo;

import com.todolist.demo.repository.TodoRepository;
import com.todolist.demo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(TodolistApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
		logger.info("Application started");
	}

	private UserRepository userRepository;
	private TodoRepository todoRepository;

	@Override
	public void run(String... args) throws Exception {

	}
}
