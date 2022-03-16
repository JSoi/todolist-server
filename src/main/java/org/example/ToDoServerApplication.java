package org.example;

import org.example.repository.TodoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoServerApplication {
    public static void main(String[] args) {
        TodoRepository repository;
        SpringApplication.run(ToDoServerApplication.class, args);
    }
}
