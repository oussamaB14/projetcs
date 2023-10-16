package com.tekup.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tekup.books.models.User;

public interface UserRepository extends JpaRepository<User,Long> {
    
}