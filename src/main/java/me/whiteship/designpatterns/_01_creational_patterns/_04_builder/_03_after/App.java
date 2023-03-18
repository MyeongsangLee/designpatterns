package me.whiteship.designpatterns._01_creational_patterns._04_builder._03_after;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        TourPlanBuilder builder = new DefaultTourBuilder();

        TourPlan plan = builder.title("일본 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2023, 10, 16))
                .whereToStay("호텔")
                .addPlan(1, "체크인 이후 짐풀기")
                .addPlan(2, "저녁식사")
                .getPlan();

        System.out.println(plan);

        TourDirector tourDirector = new TourDirector(builder);
        TourPlan canKoon = tourDirector.goCanKoon();
        System.out.println(canKoon);

    }
}
