package me.whiteship.designpatterns._03_behavioral_patterns._14_command._03_after;

public class Light {

    private boolean isOn;

    public void on() {
        System.out.println("스위치를 켭니다.");
        this.isOn = true;
    }

    public void off() {
        System.out.println("스위치를 끕니다.");
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
