package me.whiteship.designpatterns._02_structure_patterns._12_proxy._02_after;

public class GameServiceProxy implements GameService {

    private GameService gameService;

    @Override
    public void startGame() {

        long before = System.currentTimeMillis();
        if (this.gameService == null) {
            this.gameService = new DefaultGameService();
        }
        gameService.startGame();

        long after = System.currentTimeMillis();

        System.out.println(after - before);

    }
}
