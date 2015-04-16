package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import oracle.jdbc.OracleTypes;

public class Factura {

    private Connection connection;
    private CallableStatement cs;
    private int cod;

    public Factura(Connection connection) {
        this.connection = connection;
    }

    public void insertOrUpdateFactura(boolean insert, int numero, String tipo, Date fecha, float total, int cliente) throws SQLException {
        if (insert) {
            cs = connection.prepareCall("{call SP_007(?,?,?,?,?)}");
        }else{
            cs = connection.prepareCall("{call SP_008(?,?,?,?,?)}");
        }
        cs.setInt(1, numero);
        cs.setString(2, tipo);
        cs.setDate(3, fecha);
        cs.setFloat(4, total);
        cs.setInt(5, cliente);
        cs.executeUpdate();
        cs.close();
    }

    public void deleteFactura(int codigo) throws SQLException {
        cs = connection.prepareCall("{call SP_009(?)}");
        cs.setInt(1, codigo);
        cs.executeUpdate();
        cs.close();
    }

    public Object[] selectFactura(int codigo) throws SQLException {
        Object[] result = new Object[5];  // En lugar de este array, se puede crear ya sea un Cliente cm tal 
        // (con atributos definidos) o una lista o alguna otra cosa

        cs = connection.prepareCall("{? = call FS_003(?)}");
        if (connection.getMetaData().getURL().equals("jdbc:oracle:thin:@localhost:1521:xe")) {
            cs.registerOutParameter(1, OracleTypes.CURSOR);
        } else {
            cs.registerOutParameter(1, Types.OTHER);
        }
        cs.setInt(2, codigo);
        cs.execute();
        ResultSet rs = (ResultSet) cs.getObject(1);
        while (rs.next()) {
            result[0] = rs.getInt("Numero");
            result[1] = rs.getString("Tipo");
            result[2] = rs.getDate("Fecha");
            result[3] = rs.getFloat("Total");
            result[4] = rs.getInt("Cliente");
        }
        cs.close();
        return result;
        //int numero, String tipo, Date fecha, float total, int cliente
    }
    
    public Object[][] selectTodoFactura() throws SQLException {

        cs = connection.prepareCall("{? = call FS_008()}");
        if (connection.getMetaData().getURL().equals("jdbc:oracle:thin:@localhost:1521:xe")) {
            cs.registerOutParameter(1, OracleTypes.CURSOR);
        } else {
            cs.registerOutParameter(1, Types.OTHER);
        }
        cs.execute();
        ResultSet rs = (ResultSet) cs.getObject(1);
        Object[][] result = new Object[size()][5];
        int count = 0;
        while (rs.next()) {
            result[count][0] = rs.getInt("Numero");
            result[count][1] = rs.getString("Tipo");
            result[count][2] = rs.getDate("Fecha");
            result[count][3] = rs.getFloat("Total");
            result[count][4] = rs.getInt("Cliente");
            count++;
        }
        cs.close();
        return result;
    }

    public int size() throws SQLException {
        int c=0;
        Statement stm = connection.createStatement();
        ResultSet s = stm.executeQuery("Select COUNT(*) From Facturas");
        while(s.next()){
            c=s.getInt("COUNT(*)");
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
