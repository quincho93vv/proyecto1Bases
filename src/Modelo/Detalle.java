/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Alonso
 */
public class Detalle {

    private Connection connection;
    private CallableStatement cs;
    private int cod;

    public Detalle(Connection connection) {
        this.connection = connection;
    }

    public void insertOrUpdateDetalle(boolean insert, int producto, int factura, int cantidad, float total) throws SQLException {
        if (insert) {
            cs = connection.prepareCall("{call SP_010(?,?,?,?)}");
        } else {
            cs = connection.prepareCall("{call SP_011(?,?,?,?)}");
        }
        cs.setInt(1, producto);
        cs.setInt(2, factura);
        cs.setInt(3, cantidad);
        cs.setFloat(4, total);
        cs.executeUpdate();
        cs.close();
    }

    public void deleteDetalle(int producto, int factura) throws SQLException {
        cs = connection.prepareCall("{call SP_012(?,?)}");
        cs.setInt(1, producto);
        cs.setInt(2, factura);
        cs.executeUpdate();
        cs.close();
    }

    public Object[] selectDetalle(int producto, int factura) throws SQLException {
        Object[] result = new Object[4];  // En lugar de este array, se puede crear ya sea un Cliente cm tal 
        // (con atributos definidos) o una lista o alguna otra cosa

        cs = connection.prepareCall("{? = call FS_004(?,?)}");
        if (connection.getMetaData().getURL().equals("jdbc:oracle:thin:@localhost:1521:xe")) {
            cs.registerOutParameter(1, OracleTypes.CURSOR);
        } else {
            cs.registerOutParameter(1, Types.OTHER);
        }
        cs.setInt(2, producto);
        cs.setInt(3, factura);
        cs.executeUpdate();
        cs.close();
        ResultSet rs = (ResultSet) cs.getObject(1);
        while (rs.next()) {
            result[0] = rs.getInt("Producto");
            result[1] = rs.getInt("Factura");
            result[2] = rs.getInt("Cantidad");
            result[3] = rs.getFloat("Total");
        }
        cs.close();
        return result;
    }

    public Object[][] selectTodoDetalle() throws SQLException {

        cs = connection.prepareCall("{? = call FS_009()}");
        if (connection.getMetaData().getURL().equals("jdbc:oracle:thin:@localhost:1521:xe")) {
            cs.registerOutParameter(1, OracleTypes.CURSOR);
        } else {
            cs.registerOutParameter(1, Types.OTHER);
        }
        cs.execute();
        ResultSet rs = (ResultSet) cs.getObject(1);
        Object[][] result = new Object[size()][4];
        int count = 0;
        while (rs.next()) {
            result[count][0] = rs.getInt("Producto");
            result[count][1] = rs.getInt("Factura");
            result[count][2] = rs.getInt("Cantidad");
            result[count][3] = rs.getFloat("Total");
            count++;
        }
        cs.close();
        return result;
    }

    public int size() throws SQLException {
        int c = 0;
        Statement stm = connection.createStatement();
        ResultSet s = stm.executeQuery("Select COUNT(*) From Detalles");
        while (s.next()) {
            c = s.getInt("COUNT(*)");
        }
        return c;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
