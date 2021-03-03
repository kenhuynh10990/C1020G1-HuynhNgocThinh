package com.example.demo.service;

import com.example.demo.model.Customer;


public interface CustomerService {
    Iterable<Customer> findAll();
    Customer findById(int id);
    void save(Customer customer);
    void remove(int id);
}
