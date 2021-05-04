package com.mixamus.autoparts.exceptions;

public class OrderIDNotFoundException extends RuntimeException {

  public OrderIDNotFoundException(String id) {
    super("Could not find order " + id);
  }
}
