package org.example.app.errors;

public class InvalidRequestException extends ApplicationException {
    public InvalidRequestException(int code, String message) {
        super(code, message);
    }
}
