package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor._02_after;

public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        Rectangle rectangle = new Rectangle();
        rectangle.accept(phone);
    }
}
