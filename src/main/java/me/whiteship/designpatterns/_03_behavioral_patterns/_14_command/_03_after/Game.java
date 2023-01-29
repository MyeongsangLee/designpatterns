package me.whiteship.designpatterns._03_behavioral_patterns._14_command._03_after;

public class Game {

    private boolean isStart;

    public void start() {
        System.out.println("게임을 사작 합니다.");
        this.isStart = true;
    }

    public void end() {
        System.out.println("게임을 종료 합니다.");
        this.isStart = false;
    }

    public boolean isStart() {
        return isStart;
    }
}
