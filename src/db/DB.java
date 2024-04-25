package db;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {

    private static Connection conn = null;

    public static Connection getConnection(){
        if(conn == null){
            try {
                Properties pros  = loadProperties();
                String url = pros.getProperty("dburl");
                conn = DriverManager.getConnection(url, pros);
            } catch (SQLException e) {
                throw new DBExeception(e.getMessage());
            }
        }
        return conn;
    }
    public static void  closeStatement(Statement st){
        if(st != null){
            try{
                st.close();
            } catch (SQLException e) {
                throw new DBExeception(e.getMessage());
            }
        }
    }
    public static void  closeResultSet(ResultSet rs){
        if(rs != null){
            try{
                rs.close();
            } catch (SQLException e) {
                throw new DBExeception(e.getMessage());
            }
        }
    }

    public static void closeConnection(){
        if (conn != null) {
            try {
                conn.close();
            }
            catch (SQLException e ){
                throw new DBExeception(e.getMessage());
            }
        }



    }


    private static Properties loadProperties(){
        try(FileInputStream fs = new FileInputStream("db.properties")){
            Properties pros = new Properties();
            pros.load(fs);
            return pros;
        }catch(IOException e ){
            throw new DBExeception(e.getMessage());

        }
    }

}
