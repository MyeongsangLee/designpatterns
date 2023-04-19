package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibility._03_after;

import me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibility._01_before.Request;

public class Client {

    public static void main(String[] args) {
        RequestHandler requestHandler = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        requestHandler.handler(new Request("바디"));
    }
}
