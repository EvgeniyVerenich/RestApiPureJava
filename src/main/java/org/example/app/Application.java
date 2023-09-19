package org.example.app;

import com.sun.net.httpserver.HttpServer;
import org.example.app.api.user.RegistrationHandler;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Application {
    public static void main(String[] args) throws IOException {
        int serverPort = 8000;
        HttpServer server = HttpServer.create(new InetSocketAddress(serverPort),0);
        RegistrationHandler registrationHandler = new RegistrationHandler(getUserService(), getObjectMapper(),
                getErrorHandler());
    }
}
