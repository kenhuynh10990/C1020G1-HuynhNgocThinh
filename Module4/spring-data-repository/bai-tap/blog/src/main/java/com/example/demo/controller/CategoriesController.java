package com.example.demo.controller;

import com.example.demo.model.Categories;
import com.example.demo.service.CategoriesService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoriesController {
    @Autowired
    private CategoriesService categoriesService;

    @GetMapping("/category")
    public String listCategory(Model model, @PageableDefault(size = 2) Pageable pageable) {
        Page<Categories> categories = categoriesService.findAll(pageable);
        model.addAttribute("category",categories);
        return "/categoryList";
    }
    @GetMapping("/create-category")
    public String showCreateForm(Model model){
        model.addAttribute("category",new Categories());
        return "/createCategory";
    }
    @PostMapping("/create-category")
    public String saveCategory(Model model,Categories categories){
        categoriesService.save(categories);
        model.addAttribute("category",categories);
        return "redirect:/category";
    }
    @GetMapping("/edit-category/{id}")
    public String showEditForm(Model model, @PathVariable int id){
        Categories categories=categoriesService.findById(id);
        if (categories!=null){
            model.addAttribute("category",categories);
            return "/categoryEdit";
        }else{
            return "/error";
        }
    }
    @PostMapping("/edit-category")
    public String updateCategory(Categories categories, Model model){
        categoriesService.save(categories);
        model.addAttribute("category",categories);
        return "redirect:/category";
    }
    @GetMapping("/delete-category/{id}")
    public String showDeleteForm(@PathVariable int id,Model model){
        Categories categories = categoriesService.findById(id);
        if (categories!=null){
            model.addAttribute("category",categories);
            return "/categoryDelete";
        }else {
            return "/error";
        }
    }
    @PostMapping("/delete-category")
    public String deleteCategory(Categories categories,Model model){
        categoriesService.remove(categories.getId());
        return "redirect:/category";
    }
}
