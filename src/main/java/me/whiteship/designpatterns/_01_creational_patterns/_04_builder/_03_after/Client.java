package me.whiteship.designpatterns._01_creational_patterns._04_builder._03_after;

import me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

public class Client {

    public static void main(String[] args) {
        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = tourDirector.goLasVegas();

        System.out.println(tourPlan);
    }
}
