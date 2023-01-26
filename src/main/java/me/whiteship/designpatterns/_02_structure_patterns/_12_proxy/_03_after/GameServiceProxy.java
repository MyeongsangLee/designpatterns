package me.whiteship.designpatterns._02_structure_patterns._12_proxy._03_after;

public class GameServiceProxy implements GameService{

    private GameService gameService;

    @Override
    public void startGame() {

        if (this.gameService == null) {
            System.out.println("DefaultGameService");
            this.gameService = new DefaultGameService();
        }

        System.out.println("Proxy");
        this.gameService.startGame();
    }
}
