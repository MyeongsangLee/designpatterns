package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._01_before;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setBlueTeamScore(0);
        game.setRedTeamScore(10);

        System.out.println(game);

        int blueTeamScore = game.getBlueTeamScore();
        int redTeamScore = game.getRedTeamScore();

        Game restoreGame = new Game();
        restoreGame.setRedTeamScore(redTeamScore);
        restoreGame.setBlueTeamScore(blueTeamScore);

        System.out.println(restoreGame);

    }
}
