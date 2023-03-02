package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._03_after;

import java.util.ArrayList;
import java.util.List;

public class GameCareTaker {

    private List<GameSave> saveList = new ArrayList<>();

    public void addGameSave(GameSave gameSave) {
        this.saveList.add(gameSave);
    }

    public GameSave getGameSave(int i) {
        return this.saveList.get(i);
    }
}
