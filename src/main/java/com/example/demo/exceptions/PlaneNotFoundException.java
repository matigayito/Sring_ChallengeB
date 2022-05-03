package com.example.demo.exceptions;

public class PlaneNotFoundException extends RuntimeException{

    public PlaneNotFoundException(Long id) {
        super("Could not find plane " + id);
    }
}
