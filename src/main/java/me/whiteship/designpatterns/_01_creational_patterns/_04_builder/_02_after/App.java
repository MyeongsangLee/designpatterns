package me.whiteship.designpatterns._01_creational_patterns._04_builder._02_after;

import me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan cancunTrip = director.cancunTrip();
        TourPlan longBeachTrip = director.longBeachTrip();

//        TourPlanBuilder builder = new DefaultTourBuilder();
//        TourPlan cancunTrip = builder.title("칸쿤 여행")
//                .nightsAndDays(2, 3)
//                .startDate(LocalDate.of(2020, 12, 9))
//                .whereToStay("리조트")
//                .addPlan(0, "체크인하고 짐 풀기")
//                .addPlan(0, "저녁 식사")
//                .getPlan();
//
//        TourPlan longBeachTrip = builder.title("롱비치")
//                .startDate(LocalDate.of(2021, 7, 15))
//                .getPlan();
//
        System.out.println(cancunTrip);
        System.out.println(longBeachTrip);
    }
}
