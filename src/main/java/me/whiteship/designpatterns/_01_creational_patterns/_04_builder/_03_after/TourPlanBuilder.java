package me.whiteship.designpatterns._01_creational_patterns._04_builder._03_after;

import me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before.DetailPlan;
import me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;
import java.util.List;

public interface TourPlanBuilder {
    TourPlanBuilder title(String title);
    TourPlanBuilder nightsAndDays(int nights, int days);
    TourPlanBuilder startDate(LocalDate startDate);
    TourPlanBuilder whereToStay(String whereToStay);
    TourPlanBuilder addPlan(int day, String plan);
    TourPlan getTourPlan();

}
