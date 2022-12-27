package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._02_after;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//Originator
@Setter
@Getter
@ToString
public class Game {

    private int blueTeamScore;
    private int redTeamScore;

    public GameSave save() {
        return new GameSave(this.blueTeamScore, this.redTeamScore);
    }

    public void restore(GameSave gameSave) {
        this.blueTeamScore = gameSave.getBlueTeamScore();
        this.redTeamScore = gameSave.getRedTeamScore();
    }

}
