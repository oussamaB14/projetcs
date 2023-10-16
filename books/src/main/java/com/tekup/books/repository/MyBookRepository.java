package com.tekup.books.repository;
import com.tekup.books.models.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyBookRepository extends JpaRepository<MyBookList,Integer> {
    
}