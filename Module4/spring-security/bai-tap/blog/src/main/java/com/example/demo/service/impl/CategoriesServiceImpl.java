package com.example.demo.service.impl;

import com.example.demo.model.Categories;
import com.example.demo.repository.CategoriesRepository;
import com.example.demo.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService {
    @Autowired
    CategoriesRepository categoriesRepository;

    @Override
    public Page<Categories> findAll(Pageable pageable) {
        return categoriesRepository.findAll(pageable);
    }

    @Override
    public List<Categories> findAll() {
        return categoriesRepository.findAll();
    }

    @Override
    public Categories findById(int id) {
        return categoriesRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Categories categories) {
        categoriesRepository.save(categories);
    }

    @Override
    public void remove(int id) {
        categoriesRepository.deleteById(id);

    }
}
