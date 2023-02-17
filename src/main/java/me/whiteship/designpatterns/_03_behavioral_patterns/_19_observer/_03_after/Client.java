package me.whiteship.designpatterns._03_behavioral_patterns._19_observer._03_after;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("keesun");
        User user2 = new User("whiteship");

        chatServer.register("오징어게임", user1);
        chatServer.register("오징어게임", user2);

        chatServer.register("아바타", user1);

        chatServer.sendMessage(user1, "오징어게임", "2편 나온다");
        chatServer.sendMessage(user2, "아바타", "3편 나온다");

        chatServer.unregister("오징어게임", user2);

        System.out.println("-------------------------");
        chatServer.sendMessage(user1, "오징어게임", "다시 보낸다");
        chatServer.sendMessage(user2, "아바타", "다시 보낸다");


    }
}
