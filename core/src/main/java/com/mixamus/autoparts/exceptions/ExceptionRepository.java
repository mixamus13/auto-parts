package com.mixamus.autoparts.exceptions;

public class ExceptionRepository extends Exception {
    public ExceptionRepository() {
        super();
    }

    public ExceptionRepository(String message) {
        super(message);
    }

    public ExceptionRepository(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionRepository(Throwable cause) {
        super(cause);
    }

    protected ExceptionRepository(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
