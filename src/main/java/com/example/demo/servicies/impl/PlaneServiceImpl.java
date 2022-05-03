package com.example.demo.servicies.impl;

import com.example.demo.entities.Plane;
import com.example.demo.repositories.PlaneRepository;
import com.example.demo.servicies.PlaneService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaneServiceImpl implements PlaneService {

    private final PlaneRepository repository;

    public PlaneServiceImpl(PlaneRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Plane> getAllPlanes() {
        return repository.findAll();
    }
}
