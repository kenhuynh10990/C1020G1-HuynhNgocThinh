package com.example.demo.service;

import com.example.demo.model.Renter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QPageRequest;

public interface RenterService {
    Page<Renter> findAll(Pageable pageable);
    Renter findById(int id);
    void save(Renter renter);
    void remove(Renter renter);
}
