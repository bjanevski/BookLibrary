package service;

import model.Author;
import model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    List<Book> getBooksByAuthor(Author author);
}
