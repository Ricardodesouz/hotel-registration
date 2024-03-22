package model.exeception;

public class GuestException extends RuntimeException{
    private static final  Long serialVersionUNID = 1L;

    public GuestException (String msg){
        super(msg);

    }


}
