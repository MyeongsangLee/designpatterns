package me.whiteship.designpatterns._03_behavioral_patterns._14_command._03_after;

public class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        this.command.execute();
    }

    public void undo() {
        this.command.undo();
    }

    public static void main(String[] args) {
        Button button = new Button(new LightOnCommand(new Light()));
        button.press();
        button.undo();

    }
}
