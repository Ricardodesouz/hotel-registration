package db;

public class DBExeception extends RuntimeException{
    private static final long serivalVersionUID = 1L;


    public DBExeception(String msg){
        super(msg);

    }
}
