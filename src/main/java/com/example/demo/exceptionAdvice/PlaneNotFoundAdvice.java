package com.example.demo.exceptionAdvice;

import com.example.demo.exceptions.PlaneNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class PlaneNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(PlaneNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(PlaneNotFoundException ex) {
        return ex.getMessage();
    }
}