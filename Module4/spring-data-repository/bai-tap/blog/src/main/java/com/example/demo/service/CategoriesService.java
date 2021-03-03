package com.example.demo.service;

import com.example.demo.model.Categories;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoriesService {
    Page<Categories> findAll(Pageable pageable);
    Categories findById(int id);
    void save(Categories categories);
    void remove(int id);
}
