package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Plane {

    @Id
    @GeneratedValue
    private Long id;
    private String model;
    private String manufacturer;
    private int capacity;

    public Plane(String model, String manufacturer, int capacity) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.capacity = capacity;
    }

    public Plane() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getCapacity() {
        return capacity;
    }
}
