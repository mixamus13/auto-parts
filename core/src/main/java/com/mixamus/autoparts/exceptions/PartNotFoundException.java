package com.mixamus.autoparts.exceptions;

public class PartNotFoundException extends RuntimeException {

    public PartNotFoundException(Integer id) {
        super("Could not find part " + id);
    }
}
