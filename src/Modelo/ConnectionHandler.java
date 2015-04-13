package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionHandler {
    private String jdbcUrl;
    private String user;
    private String password;
    private Connection connection;
    
    public ConnectionHandler(int type, String user, String pass) throws SQLException{
        this.jdbcUrl = (type == 0) ? "jdbc:oracle:thin:@localhost:1521:xe"
                                   : "jdbc:postgresql://localhost:5432/postgres"; 
        this.user = user;
        this.password = pass;
        this.connection = DriverManager.getConnection(jdbcUrl, user, pass);
        this.connection.setAutoCommit(false);
    }

    public Connection getConnection() {
        return connection;
    }
    
    public void CloseConnection(){
        try {
            getConnection().close();
        } catch (SQLException ex) {
            System.err.println("Error al cerrar Conexión.");
        }
    }    

}
