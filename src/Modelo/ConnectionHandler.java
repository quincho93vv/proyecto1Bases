package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHandler {
    private String jdbcUrl;
    private String user;
    private String password;
    private Connection connection;
    private CallableStatement cs;
    
    public ConnectionHandler(int type, String user, String pass) throws SQLException{
        this.jdbcUrl = (type == 0) ? "jdbc:oracle:thin:@localhost:1521:xe"
                                   : "jdbc:postgresql://localhost:5432/postgres"; 
        this.user = user;
        this.password = pass;
        this.connection = DriverManager.getConnection(jdbcUrl, user, pass);
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
    
    public void insertCliente(int codigo, String nombre, int vendedor) throws SQLException{
        cs = connection.prepareCall("{call PA_001(?,?,?)}");
        cs.setInt(1, codigo);
        cs.setString(2, nombre);
        cs.setInt(3, vendedor);
        cs.executeUpdate();
    }
    
      public void selectCliente(String tipo, String valor) throws SQLException{
          // Aca se pueden hacer varios procedimientos almacenados para consultar por diferentes atributos: nombre, codigo
          // o segun el tipo ejecutar una sentencia sql distinta, que creo que se puede hacer con un IF en el procedimiento directamente
    }
    
}
