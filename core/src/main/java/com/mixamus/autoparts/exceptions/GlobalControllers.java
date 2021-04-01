package com.mixamus.autoparts.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalControllers {

    @ExceptionHandler
    public ResponseEntity<String> onError(Exception e) {
        return ResponseEntity.ok("not good!");
    }
}
