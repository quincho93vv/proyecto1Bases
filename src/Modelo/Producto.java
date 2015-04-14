
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import oracle.jdbc.OracleTypes;

public class Producto {
    private Connection connection;
    private CallableStatement cs;

    public Producto(Connection connection) {
        this.connection = connection;
    }

    public void insertOrUpdateProducto(boolean insert, int codigo, String nombre, float precio) throws SQLException {
        if (insert) {
            cs = connection.prepareCall("{call SP_013(?,?,?)}");
        }else{
            cs = connection.prepareCall("{call SP_014(?,?,?)}");
        }
        cs.setInt(1, codigo);
        cs.setString(2, nombre);
        cs.setFloat(3, precio);
        cs.executeUpdate();
        cs.close();
    }

    public void deleteProducto(int codigo) throws SQLException {
        cs = connection.prepareCall("{call SP_015(?)}");
        cs.setInt(1, codigo);
        cs.executeUpdate();
        cs.close();
    }

    public Object[] selectProducto(int codigo) throws SQLException {
        Object[] result = new Object[3];  // En lugar de este array, se puede crear ya sea un Cliente cm tal 
        // (con atributos definidos) o una lista o alguna otra cosa

        cs = connection.prepareCall("{? = call FS_005(?)}");
        if (connection.getMetaData().getURL().equals("jdbc:oracle:thin:@localhost:1521:xe")) {
            cs.registerOutParameter(1, OracleTypes.CURSOR);
        } else {
            cs.registerOutParameter(1, Types.OTHER);
        }
        cs.setInt(2, codigo);
        cs.execute();
        ResultSet rs = (ResultSet) cs.getObject(1);
        while (rs.next()) {
            result[0] = rs.getInt("Codigo");
            result[1] = rs.getString("Nombre");
            result[2] = rs.getFloat("Precio");

        }
        cs.close();
        return result;
    }
    
    public Object[][] selectTodoProducto() throws SQLException {

        cs = connection.prepareCall("{? = call seleccionarTODOSProducto}");
        if (connection.getMetaData().getURL().equals("jdbc:oracle:thin:@localhost:1521:xe")) {
            cs.registerOutParameter(1, OracleTypes.CURSOR);
        } else {
            cs.registerOutParameter(1, Types.OTHER);
        }
        cs.execute();
        ResultSet rs = (ResultSet) cs.getObject(1);
        Object[][] result = new Object[size()][3];
        int count = 0;
        while (rs.next()) {
            result[count][0] = rs.getInt("Codigo");
            result[count][1] = rs.getString("Nombre");
            result[count][2] = rs.getFloat("Precio");
            count++;
        }
        cs.close();
        return result;
    }

     public int size() throws SQLException {
        int c=0;
        Statement stm = connection.createStatement();
        ResultSet s = stm.executeQuery("Select COUNT(*) From Productos");
        while(s.next()){
            c=s.getInt("COUNT(*)");
        }
        return c; 
    }
    
}
