package org.example.app.errors;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.HttpExchange;
import org.example.app.api.Constants;
import org.example.app.api.ErrorResponse;

import java.io.IOException;

public class GlobalExceptionHandler {
    private final ObjectMapper objectMapper;

    public GlobalExceptionHandler(ObjectMapper objectMapper){
        this.objectMapper = objectMapper;
    }

    public void handle(Throwable throwable, HttpExchange exchange){
        try {
            throwable.printStackTrace();
            exchange.getResponseHeaders().set(Constants.CONTENT_TYPE, Constants.APPLICATION_JSON);
            ErrorResponse response = get
        }
    }
}
