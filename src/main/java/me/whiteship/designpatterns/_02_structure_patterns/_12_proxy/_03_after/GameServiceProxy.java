package me.whiteship.designpatterns._02_structure_patterns._12_proxy._03_after;

public class GameServiceProxy implements GameService{

    private GameService gameService;

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        if (this.gameService == null) {
            System.out.println("원본");
            this.gameService = new DefaultGameService();
        } else {
            System.out.println("proxy");
        }
        gameService.startGame();

        long after = System.currentTimeMillis();

        System.out.println(after - before);

    }
}
