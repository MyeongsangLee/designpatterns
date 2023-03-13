package me.whiteship.designpatterns._02_structure_patterns._09_decorator._04_after;

public class TrafficDecorator extends DecoratorDisplay{

    public TrafficDecorator(Display display) {
        super(display);
        drawTraffic();
    }

    private void drawTraffic() {
        System.out.println("\t교통량 표시량");
    }

}
