package com.example.controller;

import com.example.service.DictionaryService;
import com.example.service.impl.DictionaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class DictionaryController {
    @Autowired
    private DictionaryService dictionaryService;
    @GetMapping({"","/dictionary"})
    public String dictionary(@RequestParam String text, Model model){
        String result = dictionaryService.search(text);
        model.addAttribute("text",text);
        model.addAttribute("result",result);
        return "result";
    }
}
