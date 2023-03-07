package me.whiteship.designpatterns._03_behavioral_patterns._14_command._03_after;

public class Client {
    public static void main(String[] args) {
        Command lampOnCommand  = new LampOnCommand(new Lamp());
        Command alarmStartCommand   = new AlarmStartCommand(new Alarm());

        Button button1 = new Button(lampOnCommand );
        button1.pressed();

        Button button2 = new Button(alarmStartCommand );
        button2.pressed();
    }
}
