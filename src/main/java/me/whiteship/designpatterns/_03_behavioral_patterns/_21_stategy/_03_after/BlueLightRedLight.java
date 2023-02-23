package me.whiteship.designpatterns._03_behavioral_patterns._21_stategy._03_after;

public class BlueLightRedLight {

    private Speed speed;

    public BlueLightRedLight(Speed speed) {
        this.speed = speed;
    }

    public void blueLight() {
        this.speed.blueLight();
    }

    public void redLight() {
        this.speed.redLight();
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }
}
