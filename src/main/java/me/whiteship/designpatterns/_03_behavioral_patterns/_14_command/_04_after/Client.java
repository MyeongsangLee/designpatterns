package me.whiteship.designpatterns._03_behavioral_patterns._14_command._04_after;

public class Client {

    public static void main(String[] args) {
        Command command = new GameStartCommand(new Game());

        command.execute();
    }
}
