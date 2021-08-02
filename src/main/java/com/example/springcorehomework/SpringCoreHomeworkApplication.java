package com.example.springcorehomework;

import model.Author;
import model.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringCoreHomeworkApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreHomeworkApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Author author = Author.builder().name("Stephen King").build();
        Book book1 = Book.builder().title("The Stand").build();
        Book book2 = Book.builder().title("The Shining").build();
        author.setBooks(List.of(book1, book2));
    }
}
