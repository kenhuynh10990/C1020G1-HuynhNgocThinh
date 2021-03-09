package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import com.example.demo.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
import java.util.Optional;
@RestController
//@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoriesService categoriesService;


    @GetMapping("/")
    public ResponseEntity<List<Blog>> listAllBlog(){
        List<Blog> blogs = blogService.findAll();
        if (blogs.isEmpty()){
            return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<List<Blog>>(blogs,HttpStatus.OK);
        }
    }

    @GetMapping("/view/{id}")
    public ResponseEntity<Blog> viewBlog(@PathVariable int id){
        Blog blog =blogService.findById(id);
        if (blog==null){
            return new ResponseEntity<Blog>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<Blog>(blog,HttpStatus.OK);
        }
    }



//    @GetMapping("/create")
//    public ModelAndView showCreateForm(Pageable pageable) {
//        ModelAndView modelAndView = new ModelAndView("/create");
//        modelAndView.addObject("categories", categoriesService.findAll(pageable));
//        modelAndView.addObject("blog", new Blog());
//        return modelAndView;
//    }
//
//    //
//    @PostMapping("/create")
//    public ModelAndView save(Blog blog) {
//        blog.setDate(new Date());
//        blogService.save(blog);
//        ModelAndView modelAndView = new ModelAndView("redirect:/");
//
//        modelAndView.addObject("blog", new Blog());
//
//        return modelAndView;
//    }




//    @GetMapping("/")
//    public String list(Model model, @PageableDefault(size = 2, sort = "date") Pageable pageable, @RequestParam Optional<String> textSearch) {
//        if (textSearch.isPresent()) {
//            model.addAttribute("blog", blogService.findAllByTextContaining(textSearch.get(), pageable));
//            return "/list";
//        } else {
//            model.addAttribute("blog", blogService.findAll(pageable));
////            model.addAttribute("category", categoriesService.findAll(pageable));
//            return "/list";
//        }
//    }



//    @GetMapping("/edit/{id}")
//    public String showEditForm(@PathVariable int id, Model model, Pageable pageable) {
//        Blog blog = blogService.findById(id);
//        if (blog != null) {
//            model.addAttribute("categories", categoriesService.findAll(pageable));
//            model.addAttribute("blog", blog);
//            return "/edit";
//        } else {
//            return "/error";
//        }
//    }
//
//    @PostMapping("/edit")
//    public String update(Blog blog, Model model) {
//        blogService.save(blog);
//        model.addAttribute("blog", blog);
//        model.addAttribute("message", "Blog updated");
//        return "redirect:/";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String showDeleteForm(@PathVariable int id, Model model) {
//        Blog blog = blogService.findById(id);
//        if (blog != null) {
//            model.addAttribute("blog", blog);
//            return "/delete";
//        } else {
//            return "/delete";
//        }
//    }
//
//    @PostMapping("/delete")
//    public String delete(Blog blog) {
//        blogService.remove(blog.getId());
//        return "redirect:/";
//    }
//
//
//    public String viewForm(@PathVariable int id, Model model) {
//        model.addAttribute("blog", blogService.findById(id));
//        return "/viewBlog";
//    }
}
