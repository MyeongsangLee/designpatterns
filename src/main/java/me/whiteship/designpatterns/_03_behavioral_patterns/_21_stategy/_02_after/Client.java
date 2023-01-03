package me.whiteship.designpatterns._03_behavioral_patterns._21_stategy._02_after;

public class Client {

    public static void main(String[] args) {
//        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(new Normal());
//        blueLightRedLight.blueLight();
//        blueLightRedLight.redLight();

        BlueLightRedLight blueLightRedLight = new BlueLightRedLight();
        blueLightRedLight.blueLight(new Normal());
        blueLightRedLight.redLight(new Faster());

        blueLightRedLight.blueLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("blue light");
            }

            @Override
            public void redLight() {
                System.out.println("red light");
            }
        });
    }
}
