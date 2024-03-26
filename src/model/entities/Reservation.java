package model.entities;

import model.exeception.ReservationExeception;

import java.time.Duration;
import java.time.LocalDateTime;

public class Reservation {
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private Guest guest;

    public Reservation(LocalDateTime checkIn, LocalDateTime checkOut, Guest guest) {
        checkingDates(checkIn,checkOut);
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
    public void dateAlteration(LocalDateTime checkIn, LocalDateTime checkOut){
        checkingDates(checkIn,checkOut);
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        System.out.print("Datas alteradas com sucesso!");


    }
    private void checkingDates(LocalDateTime checkIn, LocalDateTime checkOut){
        Duration lengthSay = Duration.between(checkIn, checkOut);
        if(lengthSay.toSeconds() <= 0){
            throw new ReservationExeception("A data de saida não pode ser antes que a de entrada");
        }
        if(lengthSay.toHours() < 24){
            throw new ReservationExeception("Desculpe, mas o tempo minimo de estadia é um dia");
        }
        if(lengthSay.toDays() > 200){
            throw new ReservationExeception("O tempo de estadia não e suportado por nossas capicidades");
        }

    }

}
