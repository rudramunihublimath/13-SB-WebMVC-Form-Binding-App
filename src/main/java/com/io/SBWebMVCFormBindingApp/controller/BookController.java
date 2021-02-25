package com.io.SBWebMVCFormBindingApp.controller;

import com.io.SBWebMVCFormBindingApp.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BookController {
    @GetMapping("/loadform")
    public String loadBookForm(Model model){
        model.addAttribute("book",new Book());
        return "addBook";
    }

    @PostMapping("/savebook")
    public String saveBookData(Book book, Model model){
        System.out.println(book);
        return "success";
    }
}
