package com.example.demo.controllers;

import java.util.List;

import com.example.demo.entities.Flight;
import com.example.demo.exceptions.FlightNotFoundException;
import com.example.demo.repositories.FlightRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private final FlightRepository repository;

    public FlightController(FlightRepository repository) {
        this.repository = repository;
    }

/**
    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/flights")
    List<Flight> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/flights")
    Flight newFlight(@RequestBody Flight newFlight) {
        return repository.save(newFlight);
    }

    // Single item

    @GetMapping("/flights/{id}")
    Flight one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new FlightNotFoundException(id));
    }

    @GetMapping("/flights")
    List<Flight> getAll() {
        return  repository.findAll();
    }

    @PutMapping("/flights/{id}")
    Flight replaceFlight(@RequestBody Flight newFlight, @PathVariable Long id) {

        return repository.findById(id)
                .map(flight -> {
                    flight.setTo(newFlight.getTo());
                    flight.setFrom(newFlight.getFrom());
                    flight.setDate(newFlight.getDate());
                    //flight.setPlane(newFlight.getPlane());
                    return repository.save(flight);
                })
                .orElseGet(() -> {
                    newFlight.setId(id);
                    return repository.save(newFlight);
                });
    }

    @DeleteMapping("/flights/{id}")
    void deleteFlight(@PathVariable Long id) {
        repository.deleteById(id);
    }*/
}