package com.tekup.books.repository;
import com.tekup.books.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<Book,Integer> {
    
}