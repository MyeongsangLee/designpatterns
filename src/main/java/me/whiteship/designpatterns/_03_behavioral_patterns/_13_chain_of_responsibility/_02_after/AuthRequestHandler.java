package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibility._02_after;

public class AuthRequestHandler extends RequestHandler{

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handler(Request request) {
        System.out.println("인증이 되었나요?");
        System.out.println("이 핸들러를 사용할 수 있는 유저인가?");

        super.handler(request);
    }
}
