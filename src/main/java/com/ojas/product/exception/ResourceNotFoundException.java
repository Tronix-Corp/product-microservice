package com.ojas.product.exception;

public class ResourceNotFoundException extends Exception {
    public ResourceNotFoundException() {
        super("Product not found.");
    }
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
