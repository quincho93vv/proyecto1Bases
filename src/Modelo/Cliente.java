package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import oracle.jdbc.OracleTypes;

public class Cliente {
    
    private  Connection connection;
    private  CallableStatement cs;
    
    public Cliente(Connection connection){
        this.connection = connection;
    }
    
    public void insertCliente(int codigo, String nombre, int vendedor) throws SQLException{
        cs = connection.prepareCall("{call SP_001(?,?,?)}");
        cs.setInt(1, codigo);
        cs.setString(2, nombre);
        cs.setInt(3, vendedor);
        cs.executeUpdate();
        cs.close();
    }
    
    public void updateCliente(int codigo, String nombre, int vendedor) throws SQLException{
        cs = connection.prepareCall("{call SP_002(?,?,?)}");
        cs.setInt(1, codigo);
        cs.setString(2, nombre);
        cs.setInt(3, vendedor);
        cs.executeUpdate();
        cs.close();
    }
    
    public void deleteCliente(int codigo) throws SQLException{
        cs = connection.prepareCall("{call SP_003(?)}");
        cs.setInt(1, codigo);
        cs.executeUpdate();
        cs.close();
    }
    
    public Object[] selectCliente(int codigo) throws SQLException{
        Object [] result = new Object[3];  // En lugar de este array, se puede crear ya sea un Cliente cm tal 
                                           // (con atributos definidos) o una lista o alguna otra cosa
        
        cs = connection.prepareCall("{? = call FS_001(?)}");
        if(connection.getMetaData().getURL().equals("jdbc:oracle:thin:@localhost:1521:xe"))
            cs.registerOutParameter(1, OracleTypes.CURSOR);
        else
            cs.registerOutParameter(1, Types.OTHER);
        cs.setInt(2, codigo);
        cs.execute();
        ResultSet rs = (ResultSet) cs.getObject(1);
        while (rs.next()) {
            result[0] = rs.getInt("Codigo");
            result[1] = rs.getString("Nombre");
            result[2]  = rs.getInt("Vendedor");
        }
        cs.close();
        return result;
    }
    
}
