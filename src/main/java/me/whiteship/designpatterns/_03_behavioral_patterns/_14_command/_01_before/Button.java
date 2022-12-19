package me.whiteship.designpatterns._03_behavioral_patterns._14_command._01_before;

public class Button {
    private Light light;

    public Button(Light game) {
        this.light = game;
    }

    public void press() {
        light.isOn();
    }

    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.press();
        button.press();
    }

}
