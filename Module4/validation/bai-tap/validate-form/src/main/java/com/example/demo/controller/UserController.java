package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.model.IModel;

import javax.validation.Valid;

@Controller
public class UserController {
    @GetMapping("/")
    public String showForm(Model model){
        model.addAttribute("user",new User());
        return "index";
    }

    @PostMapping("/")
    public String checkValidation(@Valid User user, BindingResult bindingResult,Model model){
        new User().validate(user,bindingResult);
        if (bindingResult.hasFieldErrors()|| bindingResult.hasErrors()){
            return "index";

        }else {
            model.addAttribute("user",user);
            return "result";
        }
    }

}
