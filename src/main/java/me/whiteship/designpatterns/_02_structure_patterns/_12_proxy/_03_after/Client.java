package me.whiteship.designpatterns._02_structure_patterns._12_proxy._03_after;

public class Client {
    public static void main(String[] args) {

        GameService gameService = new GameServiceProxy();
        gameService.startGame();
        gameService.startGame();
    }
}
