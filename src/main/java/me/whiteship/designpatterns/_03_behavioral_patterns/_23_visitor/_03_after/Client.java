package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor._03_after;

public class Client {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Phone phone = new Phone();
        rectangle.accept(phone);
    }
}
