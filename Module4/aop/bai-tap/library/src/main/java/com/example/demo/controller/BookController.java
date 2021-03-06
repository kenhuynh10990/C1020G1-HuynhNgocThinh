package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.model.Renter;
import com.example.demo.service.BookService;
import com.example.demo.service.RenterService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class BookController {
    @Autowired
    BookService bookService;
    @Autowired
    RenterService renterService;

    @GetMapping("/")
    public String showList(Model model, @PageableDefault(size = 3) Pageable pageable) {
        model.addAttribute("book", bookService.findAll(pageable));
        return "/list";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("book", new Book());
        return "/create";
    }

    @PostMapping("/create")
    public String save(Model model, Book book) {
        bookService.save(book);
        model.addAttribute("book", book);
        return "redirect:/";
    }

}
