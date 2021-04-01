package com.mixamus.autoparts.exceptions;

public class ClientNotFoundException extends RuntimeException {

    public ClientNotFoundException(String id) {
        super("Could not find client" + id);
    }
}
