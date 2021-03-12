//package com.example.demo.controller;
//
//import com.example.demo.model.Blog;
//import com.example.demo.service.BlogService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class SearchController {
//    @Autowired
//    BlogService blogService;
//    @GetMapping("/search")
//    public ResponseEntity<List<Blog>> search(@RequestParam String textSearch){
//        List<Blog> blogs = blogService.findAllByTextContaining(textSearch);
//        if(blogs==null){
//            return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<List<Blog>>(blogs,HttpStatus.OK);
//
//    }
//
//}
