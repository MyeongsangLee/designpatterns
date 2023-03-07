package me.whiteship.designpatterns._03_behavioral_patterns._14_command._03_after;


public class LampOnCommand implements Command {

    private Lamp lamp;

    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        this.lamp.turnOn();
    }
}
