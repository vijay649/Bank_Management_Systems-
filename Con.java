package bank.management.system;

//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con {
    Connection connection;
    Statement statement;

    public Con() {
        try{
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","12345678");
            connection =DriverManager.getConnection("JDBC:mysql://localhost:3306/bankSystem","root","root");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
