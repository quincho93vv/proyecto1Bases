package Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

public class ConnectionHandler {
    private String jdbcUrl;
    private String user;
    private String password;
    private Connection connection;
    
    public ConnectionHandler(int type, String user, String pass){
        this.jdbcUrl = (type == 1) ? "jdbc:oracle:thin:@localhost:1521:xe"
                                   : "jdbc:postgresql://localhost:5432/postgres"; 
        this.user = user;
        this.password = pass;
        try {
            OracleDataSource datasource = new OracleDataSource();
            datasource.setURL(jdbcUrl);
            connection = datasource.getConnection(user,password);
        } catch(SQLException e){
            System.err.println("Error al establecer Conexión.");
        }
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
