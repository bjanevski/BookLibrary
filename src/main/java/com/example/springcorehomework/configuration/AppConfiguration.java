package com.example.springcorehomework.configuration;

import model.Author;
import model.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.AuthorService;
import service.BookService;

import java.util.List;

@Configuration
public class AppConfiguration {

    @Bean
    public BookService bookServiceConfig(){
        return new BookService() {
            @Override
            public List<Book> getAllBooks() {
                return null;
            }

            @Override
            public List<Book> getBooksByAuthor(Author author) {
                return null;
            }
        };
    }

    @Bean
    public AuthorService authorServiceConfig(){
        return new AuthorService() {
            @Override
            public List<Author> getAllAuthors() {
                return null;
            }
        };
    }
}
