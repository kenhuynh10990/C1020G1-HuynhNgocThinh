package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SearchController {
    @Autowired
    BlogService blogService;
    @GetMapping("/search")
    public ResponseEntity<List<Blog>> search(@RequestParam String textSearch){
        List<Blog> blogs = blogService.findAllByTextContaining(textSearch);
        if(blogs==null){
            return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Blog>>(blogs,HttpStatus.OK);

    }

    @GetMapping("/list")
    public ResponseEntity<Page<Blog>> list(@PageableDefault(size = 2) Pageable pageable){
        Page<Blog> blogs = blogService.findAll(pageable);
        if (blogs==null) {
            return new ResponseEntity<>( HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(blogs,HttpStatus.OK);
        }
    }

}
