package org.example.app.errors;

import java.util.function.Function;
import java.util.function.Supplier;

public class ApplicationExceptions {

    public static Function<? super Throwable, RuntimeException> invalidRequest(){
        return throwable -> new InvalidRequestException(400, throwable.getMessage());
    }

    public static Supplier<RuntimeException> methodNotAllowed(String message) {
        return () -> new MethodNotAllowedException(405, message);
    }

    public static Supplier<RuntimeException> notFound(String message) {
        return () -> new ResourceNotFoundException(404, message);
    }
}
