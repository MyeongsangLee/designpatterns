package me.whiteship.designpatterns._03_behavioral_patterns._14_command._03_after;

public class GameStartCommand implements Command{

    private Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.start();
    }

    @Override
    public void undo() {
        new GameEndCommand(game).execute();
    }
}
