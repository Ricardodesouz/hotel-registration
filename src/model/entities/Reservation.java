package model.entities;

import model.exeception.ReservationExeception;

import java.time.Duration;
import java.time.LocalDateTime;

public class Reservation {
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private Guest guest;

    public Reservation(LocalDateTime checkIn, LocalDateTime checkOut, Guest guest) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.guest = guest;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

}
