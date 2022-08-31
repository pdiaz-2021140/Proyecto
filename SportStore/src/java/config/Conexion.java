
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection conexion;
    
    public Connection Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBSportStore?useSSL=false", "root", "admin");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se puede realizar la conexion a la Base de Datos");
        }
        
        return conexion;
    }
}
