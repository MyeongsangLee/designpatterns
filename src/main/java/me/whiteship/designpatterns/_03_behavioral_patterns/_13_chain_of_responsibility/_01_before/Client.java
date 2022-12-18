package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibility._01_before;

public class Client {

    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");
//        RequestHandler requestHandler = new RequestHandler();
//        RequestHandler requestHandler = new AuthRequestHandler();  //직접 추가 -> 로그인책임이 추가 되면
        RequestHandler requestHandler = new LoggingRequestHandler();  //직접추가 auth와 동시에 하면 복잡해진다.
        requestHandler.handler(request);

    }
}
