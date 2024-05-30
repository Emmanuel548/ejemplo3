package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    Connection con;
    
    public Conexion() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/inegi2020", "root", "2001");
        } catch (Exception e) {
            System.err.print("No se pude establecer conexion con la base de datos. Error: " + e);
        }
    }
    public Connection getConnection() {
        return con;
    }
}
