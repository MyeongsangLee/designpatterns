package me.whiteship.designpatterns._03_behavioral_patterns._14_command._04_after;

public class GameStartCommand implements Command{

    private Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }


    @Override
    public void execute() {
        game.start();
    }
}
