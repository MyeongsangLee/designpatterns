package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._02_after;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(10);

        System.out.println(game);

        GameSave save = game.save();

        game.setBlueTeamScore(20);
        game.setRedTeamScore(20);

        System.out.println(game);

        game.restore(save);
        System.out.println(game);

    }

}
