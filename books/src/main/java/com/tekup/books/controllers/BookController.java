package com.tekup.books.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BookController {
    @GetMapping("/")
    public String  home() {
        return "home";
    }
     @GetMapping("/register_book")
    public String  bookRegister() {
        return "bookRegister";
    }
    
    @GetMapping("/Available_books")
    public String  getAllBooks() {
        return "bookList";
    }
}