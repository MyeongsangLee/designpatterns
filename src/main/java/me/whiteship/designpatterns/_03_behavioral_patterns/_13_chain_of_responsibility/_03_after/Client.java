package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibility._03_after;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork(String body) {
        Request request = new Request(body);
        this.requestHandler.handler(request);
    }

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoginRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork("주문요청합니다.");
    }
}
