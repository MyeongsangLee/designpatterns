package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._02_after;

import java.time.LocalDateTime;

public class Hotel {
    public static void main(String[] args) {
        Guest guest = new Guest();
        guest.getTowers(3);
        FrontDesk frontDesk = guest.getFrontDesk();

        frontDesk.dinner(guest, LocalDateTime.now());
        frontDesk.getTowers(guest, 3);
        //FrontDesk frontDesk = guest.getFrontDesk();

    }
}
