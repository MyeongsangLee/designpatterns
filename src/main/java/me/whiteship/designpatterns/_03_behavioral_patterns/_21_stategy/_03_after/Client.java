package me.whiteship.designpatterns._03_behavioral_patterns._21_stategy._03_after;

public class Client {

    public static void main(String[] args) {

        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(new Slow());
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();

        blueLightRedLight.setSpeed(new Normal());
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();



    }
}
