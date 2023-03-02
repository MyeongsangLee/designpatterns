package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._03_after;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Game {

    private int blueTeamScore;
    private int redTeamScore;

    public GameSave save() {
        return new GameSave(blueTeamScore, redTeamScore);
    }

    public void restore(GameSave gameSave) {
        this.blueTeamScore = gameSave.getBlueTeamScore();
        this.redTeamScore = gameSave.getRedTeamScore();
    }
}
