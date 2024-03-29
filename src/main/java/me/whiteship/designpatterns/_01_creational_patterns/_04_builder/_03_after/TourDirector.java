package me.whiteship.designpatterns._01_creational_patterns._04_builder._03_after;

import java.time.LocalDate;

public class TourDirector {
    TourPlanBuilder builder;

    public TourDirector(TourPlanBuilder builder) {
        this.builder = builder;
    }

    public TourPlan goCanKoon() {
        return builder.title("깐툰 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2023, 10, 16))
                .whereToStay("호텔")
                .addPlan(1, "체크인 이후 짐풀기")
                .addPlan(2, "저녁식사")
                .getPlan();
    }

}
