package com.mixamus.autoparts.domain;

public enum StatusOrderID {
    IN_STOCK(true),
    NOT_IN_STOCK(false);

    private final boolean value;

    StatusOrderID(boolean value) {
        this.value = value;
    }

    boolean getValue() {
        return this.value;
    }
}
