package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibility._03_after;

public class PrintRequestHandler extends RequestHandler{
    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handler(Request request) {
        System.out.println("출력");
        super.handler(request);
    }
}
