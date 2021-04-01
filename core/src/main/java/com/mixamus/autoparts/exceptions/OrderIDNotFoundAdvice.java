package com.mixamus.autoparts.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class OrderIDNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(OrderIDNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String partNotFoundHandler(PartNotFoundException ex) {
        return ex.getMessage();
    }
}
