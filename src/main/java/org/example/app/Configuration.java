package org.example.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.app.errors.GlobalExceptionHandler;
import org.example.data.user.InMemoryUserRepository;
import org.example.domain.user.UserRepository;
import org.example.domain.user.UserService;

public class Configuration {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final UserRepository USER_REPOSITORY = new InMemoryUserRepository();
    private static final UserService USER_SERVICE = new UserService(USER_REPOSITORY);
    private static final GlobalExceptionHandler GLOBAL_EXCEPTION_HANDLER = new GlobalExceptionHandler(OBJECT_MAPPER);

}
