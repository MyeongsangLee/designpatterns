package me.whiteship.designpatterns._03_behavioral_patterns._14_command._02_after;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
        System.out.println(light.isOn());
    }

    @Override
    public void undo() {
        new LightOnCommand(this.light).undo();;
    }
}
