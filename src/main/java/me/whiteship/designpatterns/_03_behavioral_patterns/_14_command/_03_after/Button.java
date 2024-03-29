package me.whiteship.designpatterns._03_behavioral_patterns._14_command._03_after;

public class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void pressed() {
        this.command.execute();
    }
}
