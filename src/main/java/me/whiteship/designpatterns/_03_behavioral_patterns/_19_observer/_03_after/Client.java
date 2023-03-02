package me.whiteship.designpatterns._03_behavioral_patterns._19_observer._03_after;

public class Client {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("keesun");
        User user2 = new User("whiteship");
        User user3 = new User("myeongsang");
        chatServer.register("오징어게임", user1);
        chatServer.register("오징어게임", user2);
        chatServer.register("앤트맨", user1);

        chatServer.sendMessage(user1, "오징어게임", "2편나옵니다.");
    }
}
