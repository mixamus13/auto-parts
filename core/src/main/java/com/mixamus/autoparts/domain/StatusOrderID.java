package com.mixamus.autoparts.domain;

public enum StatusOrderID {
    IN_STOCK("IN_STOCK"),
    NOT_IN_STOCK("NOT_IN_STOCK");

    private final boolean value;

    StatusOrderID(String value) {
        this.value = Boolean.parseBoolean(value);
    }

    boolean getValue() {
        return this.value;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(StatusOrderID.IN_STOCK.getValue());
        System.out.println(StatusInStock.IN_STOCK.getValue());
    }
}

enum StatusInStock {
    IN_STOCK("IN_STOCK");

    private boolean value;

    StatusInStock(String value) {
        this.value = Boolean.parseBoolean(value);
    }

    boolean getValue() {
        return this.value = true;
    }
}