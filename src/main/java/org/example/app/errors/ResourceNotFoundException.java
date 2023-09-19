package org.example.app.errors;

public class ResourceNotFoundException extends ApplicationException {
    public ResourceNotFoundException(int i, String message) {
        super(i, message);
    }
}
