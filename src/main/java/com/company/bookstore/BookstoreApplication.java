package com.company.bookstore;

import com.company.bookstore.model.Book;
import com.company.bookstore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

    private final BookRepository bookRepository;

    public BookstoreApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {

        SpringApplication.run(BookstoreApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Book book1 = Book.builder()
                .name("To Kill a Mockingbird")
                .author("Harper Lee")
                .price(15.0)
                .stock(20)
                .build();

        Book book2 = Book.builder()
                .name("1984")
                .author("George Orwell")
                .price(12.0)
                .stock(18)
                .build();

        Book book3 = Book.builder()
                .name("Pride and Prejudice")
                .author("Jane Austen")
                .price(18.0)
                .stock(25)
                .build();

        bookRepository.saveAll(Arrays.asList(book1, book2, book3));
    }

}
