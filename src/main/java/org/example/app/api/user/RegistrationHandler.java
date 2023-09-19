package org.example.app.api.user;

import com.sun.net.httpserver.HttpExchange;
import org.example.app.api.Constants;
import org.example.app.api.Handler;
import org.example.app.api.ResponseEntity;
import org.example.domain.user.NewUser;

import java.io.InputStream;

public class RegistrationHandler extends Handler {
    @Override
    protected void execute(HttpExchange exchange) throws Exception {
        byte[] response;
        if ("POST".equals(exchange.getRequestMethod())){
            ResponseEntity e = doPost(exchange.getRequestBody());
            exchange.getResponseHeaders().putAll(e.getHeaders());

        }
    }

    private ResponseEntity<RegistrationResponse> doPost(InputStream is) {
        RegistrationRequest registerRequest = super.readRequest(is, RegistrationRequest.class);

        NewUser user = NewUser.builder()
                .login(registerRequest.getLogin())
                .password(PasswordEncoder.encode(registerRequest.getPassword()))
                .build();

        String userId = userService.create(user);

        RegistrationResponse response = new RegistrationResponse(userId);

        return new ResponseEntity<>(response,
                getHeaders(Constants.CONTENT_TYPE, Constants.APPLICATION_JSON), StatusCode.OK);
    }
}
