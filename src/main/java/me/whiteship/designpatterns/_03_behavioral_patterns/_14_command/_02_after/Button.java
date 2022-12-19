package me.whiteship.designpatterns._03_behavioral_patterns._14_command._02_after;

import java.util.Stack;

public class Button {

//    private Command command;
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
        Button button1 = new Button();
        button1.press(new GameStartCommand(new Game()));
        button1.press(new LightOnCommand(new Light()));

        button1.undo();
        button1.undo();

    }

}
