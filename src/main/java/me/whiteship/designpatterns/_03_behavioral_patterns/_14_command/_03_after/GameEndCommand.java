package me.whiteship.designpatterns._03_behavioral_patterns._14_command._03_after;

public class GameEndCommand implements Command{

    private Game game;

    public GameEndCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.end();
    }
}
