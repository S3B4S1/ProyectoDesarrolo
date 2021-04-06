package Conection;
import java.sql.Connection;
import java.sql.DriverManager;


public class Connection_Class{
    public Connection con;
    public Connection_Class(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_ready_db","root","MySql*753951");
        }catch(Exception e){
            System.err.println("Error:" +e);
        }
    }
}