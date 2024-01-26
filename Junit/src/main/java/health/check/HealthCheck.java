package health.check;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HealthCheck {

    // Parámetros para la conexión a la base de datos
    String USER_NAME = "sqlHealth";
    String PASSWORD = "root";
    String DATA_BASE = "HealthCheck";
    String IP = "localhost";
    String PORT = "1433";

    Connection connection;

    public Connection sqlServerConection() {
        try {
            String URL = "jdbc:sqlserver://" + IP + ":" + PORT + ";" + "databaseName=" + DATA_BASE;
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexión exitosa");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        } finally {
            try {
                // Cerrar la conexión al finalizar
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }

        }
        return connection;
    }
    
    public Connection postgreSQLConnection(String ip, int port, String dbName, String user, String pass) {
        try {
            String URL = "jdbc:postgresql://" + ip + ":" + port + "/" + dbName;
            connection = DriverManager.getConnection(URL, user, pass);
            JOptionPane.showMessageDialog(null, "Conexión exitosa");

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        } 
        return connection;
    }
    
    public Connection mySQLConnection(String ip, int port, String dbName, String user, String pass) {
        try {
            String URL = "jdbc:mysql://" + ip + ":" + port + "/" + dbName;
            connection = DriverManager.getConnection(URL, user, pass);
            JOptionPane.showMessageDialog(null, "Conexión exitosa");

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        } 
        return connection;
    }
    


}


