package com.example.demo.controllers;

import java.util.List;

import com.example.demo.entities.Plane;
import com.example.demo.servicies.PlaneService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/planes")
public class PlaneController {

    private final PlaneService planeService;

    public PlaneController(PlaneService planeService) {
        this.planeService = planeService;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping
    ResponseEntity<List<Plane>> all() {
        return ResponseEntity.ok().build();
    }
    // end::get-aggregate-root[]
/**
    @PostMapping("/planes")
    Plane newPlane(@RequestBody Plane newPlane) {
        return repository.save(newPlane);
    }

    // Single item

    @GetMapping("/planes/{id}")
    Plane one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new PlaneNotFoundException(id));
    }

    @GetMapping("/planes")
    List<Plane> getAll() {
        return  repository.findAll();
    }

    @PutMapping("/planes/{id}")
    Plane replacePlane(@RequestBody Plane newPlane, @PathVariable Long id) {

        return repository.findById(id)
                .map(plane -> {
                    plane.setCapacity(newPlane.getCapacity());
                    plane.setManufacturer(newPlane.getManufacturer());
                    plane.setModel(newPlane.getModel());
                    return repository.save(plane);
                })
                .orElseGet(() -> {
                    newPlane.setId(id);
                    return repository.save(newPlane);
                });
    }

    @DeleteMapping("/planes/{id}")
    void deletePlane(@PathVariable Long id) {
        repository.deleteById(id);
    }**/
}