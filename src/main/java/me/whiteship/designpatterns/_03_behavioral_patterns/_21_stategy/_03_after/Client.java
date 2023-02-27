package me.whiteship.designpatterns._03_behavioral_patterns._21_stategy._03_after;

public class Client {

    public static void main(String[] args) {
//        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(new Faster());
//        blueLightRedLight.blueLight();
//        blueLightRedLight.redLight();

        BlueLightRedLight blueLightRedLight = new BlueLightRedLight();
        blueLightRedLight.blueLight(new Faster());
        blueLightRedLight.blueLight(new Slow());

        blueLightRedLight.blueLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("dkfjsdlf");
            }

            @Override
            public void redLight() {
                System.out.println("dkljflsdjf");
            }
        });

    }
}
