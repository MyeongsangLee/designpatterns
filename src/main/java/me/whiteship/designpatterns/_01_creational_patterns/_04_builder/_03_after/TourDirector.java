package me.whiteship.designpatterns._01_creational_patterns._04_builder._03_after;

import me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class TourDirector {
    private DefaultTourBuilder defaultTourBuilder;

    public TourDirector(DefaultTourBuilder defaultTourBuilder) {
        this.defaultTourBuilder = defaultTourBuilder;
    }

    public TourPlan goLasVegas() {
        TourPlan tourPlan = this.defaultTourBuilder
                .title("즐거운 나의여행")
                .nightsAndDays(3, 4)
                .startDate(LocalDate.of(2023, 1, 11))
                .whereToStay("라스베이거스")
                .addPlan(1, "트레져아일랜드")
                .addPlan(1, "세렌디옹")
                .addPlan(3, "벨라지오")
                .getTourPlan();
        return tourPlan;
    }
}
