package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibility._03_after;

public class Client {

    public static void main(String[] args) {
        Request request = new Request("이제 시작 합니다.");
        AuthRequestHandler handler = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        handler.handler(request);
    }
}
