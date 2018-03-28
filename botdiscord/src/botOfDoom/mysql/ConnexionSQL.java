package botOfDoom.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnexionSQL {
    private Connection connection = null;
    private Statement stmp = null;
    public ConnexionSQL(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/game","root","root");
            stmp = connection.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public Statement getStmp() {
        return stmp;
    }
}
