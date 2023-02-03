package me.whiteship.designpatterns._03_behavioral_patterns._14_command._03_after;

import java.util.Stack;

public class Button {

    private Stack<Command> commands = new Stack<>();

    public void press(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        if (!commands.isEmpty()) {
            Command command = commands.pop();
            command.undo();
        }
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.press(new LightOnCommand(new Light()));
        button.press(new GameStartCommand(new Game()));
        button.undo();
        button.undo();
    }
}
