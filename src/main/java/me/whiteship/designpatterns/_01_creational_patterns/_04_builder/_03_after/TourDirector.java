package me.whiteship.designpatterns._01_creational_patterns._04_builder._03_after;

import me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class TourDirector {
    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTour() {
        TourPlan plan = tourPlanBuilder.title("칸쿤")
                .nightsAndDays(3, 4)
                .startDate(LocalDate.now())
                .whereToStay("칸툰 호텔")
                .addPlan(1, "수영장")
                .addPlan(2, "호텔")
                .addPlan(3, "비치")
                .addPlan(4, "전통시장")
                .addPlan(5, "박물관")
                .getPlan();
        return plan;
    }
}
