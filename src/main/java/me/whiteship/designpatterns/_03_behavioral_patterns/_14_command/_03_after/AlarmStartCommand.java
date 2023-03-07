package me.whiteship.designpatterns._03_behavioral_patterns._14_command._03_after;

public class AlarmStartCommand implements Command {

    private Alarm alarm;

    public AlarmStartCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        this.alarm.start();
    }
}
