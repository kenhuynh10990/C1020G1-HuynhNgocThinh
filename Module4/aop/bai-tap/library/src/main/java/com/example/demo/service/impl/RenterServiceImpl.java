package com.example.demo.service.impl;

import com.example.demo.model.Renter;
import com.example.demo.repository.RenterRepository;
import com.example.demo.service.RenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RenterServiceImpl implements RenterService {
    @Autowired
    RenterRepository renterRepository;

    @Override
    public Page<Renter> findAll(Pageable pageable) {
        return renterRepository.findAll(pageable);
    }

    @Override
    public Renter findById(int id) {
        return renterRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Renter renter) {
        renterRepository.save(renter);
    }

    @Override
    public void remove(Renter renter) {

    }
}
