package com.todolist.demo;

import com.todolist.demo.entity.Todo;
import com.todolist.demo.entity.User;
import com.todolist.demo.repository.TodoRepository;
import com.todolist.demo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired; // <-- 추가된 임포트
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TodolistApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(TodolistApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
		logger.info("Application started");
	}

	// 여기에 @Autowired를 붙여줍니다!
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private TodoRepository todoRepository;

	@Override
	public void run(String... args) throws Exception {
		User admin = new User("admin", "admin", "ADMIN");
		User user1 = new User("homerSimson", "1234", "USER");
		User user2 = new User("bartSimson", "5678", "USER");
		userRepository.saveAll(Arrays.asList(admin,user1,user2));
		todoRepository.save(new Todo("Test Todos",admin));
		todoRepository.save(new Todo("SQLD 공부하기",user1));
		todoRepository.save(new Todo("벽에 낙서하기",user2));
		todoRepository.save(new Todo("보드 바퀴 갈아끼기",user2));
	}
}