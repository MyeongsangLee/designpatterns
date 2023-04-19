package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibility._03_after;

import me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibility._01_before.Request;

public class AuthRequestHandler extends RequestHandler{

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handler(Request request) {
        System.out.println("권한");
        super.handler(request);
    }
}
