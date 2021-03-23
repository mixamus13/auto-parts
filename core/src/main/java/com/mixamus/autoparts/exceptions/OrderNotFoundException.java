package com.mixamus.autoparts.exceptions;

public class OrderNotFoundException extends RuntimeException {

    public OrderNotFoundException(String id) {
        super("Could not find order" + id);
    }
}
