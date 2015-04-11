package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Cliente {
    
    private  Connection connection;
    private  CallableStatement cs;
    
    public Cliente(Connection connection){
        this.connection = connection;
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
