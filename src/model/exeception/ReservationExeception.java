package model.exeception;

public class ReservationExeception extends RuntimeException{
    private static final Long serialVersionUNID = 1L;

    public ReservationExeception(String msg){
        super(msg);
    }

}
