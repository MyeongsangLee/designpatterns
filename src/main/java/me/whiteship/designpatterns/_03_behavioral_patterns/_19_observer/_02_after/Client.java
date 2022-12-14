package me.whiteship.designpatterns._03_behavioral_patterns._19_observer._02_after;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("keesun");
        User user2 = new User("whiteship");

        chatServer.register("오징어게임", user1);
        chatServer.register("오징어게임", user2);

        chatServer.register("아바타2", user1);

        chatServer.sendMessage(user1, "오징어게임", "2편 나온다");
        chatServer.sendMessage(user2, "아바타2", "2편 재미 있다.");

        chatServer.unregister("오징어게임", user2);

        chatServer.sendMessage(user1, "오징어게임", "오징어게임 1명 구독해지");


    }
}
