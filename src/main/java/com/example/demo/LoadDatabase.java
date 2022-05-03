package com.example.demo;

import com.example.demo.entities.Flight;
import com.example.demo.entities.Plane;
import com.example.demo.repositories.FlightRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(FlightRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Flight("Buenos Aires", "Cordoba", new Date(), new Plane("basic", "fake manufacturer", 500))));
            log.info("Preloading " + repository.save(new Flight("Buenos Aires", "Cordoba", new Date(), new Plane("complex", "fake manufacturer", 600))));
        };
    }
}