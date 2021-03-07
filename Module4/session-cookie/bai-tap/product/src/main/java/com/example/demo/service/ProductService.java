package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {
    List<Product> findAll();
    Product findById(Integer id);
    Double totalPrice(Map<Product,Integer> cart);
}
