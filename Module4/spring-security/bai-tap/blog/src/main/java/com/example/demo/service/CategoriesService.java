package com.example.demo.service;

import com.example.demo.model.Categories;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoriesService {
    Page<Categories> findAll(Pageable pageable);
    List<Categories> findAll();
    Categories findById(int id);
    void save(Categories categories);
    void remove(int id);
}
