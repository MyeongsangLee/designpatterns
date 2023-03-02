package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._03_after;

public class Client {

    public static void main(String[] args) {
        GameCareTaker careTaker = new GameCareTaker();
        Game game = new Game();

        game.setBlueTeamScore(10);
        game.setRedTeamScore(10);
        System.out.println(game);

        careTaker.addGameSave(game.save());

        game.setBlueTeamScore(20);
        game.setRedTeamScore(20);
        careTaker.addGameSave(game.save());

        System.out.println(game);

        game.restore(careTaker.getGameSave(1));
        System.out.println(game);

        game.restore(careTaker.getGameSave(0));
        System.out.println(game);



    }
}
