package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.model.Renter;
import com.example.demo.service.BookService;
import com.example.demo.service.RenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RenterController {
    @Autowired
    RenterService renterService;
    @Autowired
    BookService bookService;

    @GetMapping("view/{id}")
    public String showRentBook(@PathVariable int id, Model model, RedirectAttributes redirectAttributes) {
        Book book = bookService.findById(id);
        if (book.getQuality() > 0) {
            model.addAttribute("book", book);
            return "/viewBook";
        } else {
            redirectAttributes.addFlashAttribute("message",   book.getBookName()+" has run out");
            return "redirect:/";
        }
    }

    @GetMapping("/view/{id}/rented")
    public String rented(Model model, @PathVariable int id) {
       Book book= bookService.findById(id);
        Renter renter = new Renter();
        renter.setBook(book);

        bookService.rentBook(book);
        renterService.save(renter);
        return "redirect:/";
    }
    @GetMapping("/refund")
    public String showRefundForm(Model model){
        return "/refund";
    }

    @PostMapping("/refund")
    public String refund(@RequestParam int idRenter, Model model){
        Renter renter = renterService.findById(idRenter);
        if (renter == null){
            model.addAttribute("message","Not found");
            model.addAttribute("idRenter",idRenter);
            return "refund";
        }

        bookService.refund(renter.getBook());
        renterService.remove(renter);
//        WriteFile.nameOfBook = renter.getBook().getNameOfBook();
        return "redirect:/";

    }


}
