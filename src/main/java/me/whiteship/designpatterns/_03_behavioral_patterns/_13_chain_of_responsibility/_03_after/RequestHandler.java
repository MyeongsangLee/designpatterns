package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibility._03_after;

import me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibility._01_before.Request;

public class RequestHandler {

    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handler(Request request) {
        if (this.nextHandler != null)
            nextHandler.handler(request);
        else
            System.out.println(request.getBody());
    }

}
