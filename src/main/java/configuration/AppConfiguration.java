package configuration;

import model.Author;
import model.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.BookRepository;
import service.AuthorService;
import service.BookService;

import java.util.List;

@Configuration
public class AppConfiguration {

    @Bean
    public BookService bookServiceConfiguration(){
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
    public AuthorService authorServiceConfiguration(){
        return new AuthorService() {
            @Override
            public List<Author> getAllAuthors() {
                return null;
            }
        };
    }
}
