package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._02_after;

import java.time.LocalDateTime;

public class FrontDesk {
    private CleaningService cleaningService;
    private Restaurant restaurant = new Restaurant();

    public FrontDesk() {
        this.cleaningService = new CleaningService(this);
    }

    public void dinner(Guest guest, LocalDateTime dateTime) {
        restaurant.dinner(guest.getId(), dateTime);
    }

    public void getTowers(Guest guest, int numberOfTowers) {
        cleaningService.getTowers(guest.getId(), numberOfTowers);
    }

    public String getRoomNumberFor(Integer guestId) {
        return "11112";
    }
}
