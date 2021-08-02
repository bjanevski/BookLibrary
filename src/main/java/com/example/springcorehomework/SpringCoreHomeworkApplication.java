package com.example.springcorehomework;

import model.Author;
import model.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import service.AuthorService;
import service.BookService;

import java.util.List;

@SpringBootApplication
public class SpringCoreHomeworkApplication implements CommandLineRunner {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringCoreHomeworkApplication.class, args);

        BookService bookService = context.getBean(BookService.class);
        bookService.getAllBooks();
        AuthorService authorService = context.getBean(AuthorService.class);
        authorService.getAllAuthors();
        bookService.getBooksByAuthor(authorService.getAllAuthors().get(0));
    }

    @Override
    public void run(String... args) throws Exception {
        Author author = Author.builder().name("Stephen King").build();
        Book book1 = Book.builder().title("The Stand").build();
        Book book2 = Book.builder().title("The Shining").build();
        author.setBooks(List.of(book1, book2));
    }
}
