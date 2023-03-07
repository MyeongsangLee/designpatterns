package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibility._03_after;

public class LoginRequestHandler extends RequestHandler {

    public LoginRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handler(Request request) {
        System.out.println("로그인");
        super.handler(request);
    }
}
