package me.whiteship.designpatterns._02_structure_patterns._12_proxy._02_after;

public class Client {

    public static void main(String[] args) {
        GameServiceProxy gameServiceProxy = new GameServiceProxy();
        gameServiceProxy.startGame();
        gameServiceProxy.startGame();
    }
}
