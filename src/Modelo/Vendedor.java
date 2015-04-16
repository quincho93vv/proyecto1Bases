
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import oracle.jdbc.OracleTypes;

public class Vendedor {

    private Connection connection;
    private CallableStatement cs;
    private int cod;

    public Vendedor(Connection connection) {
        this.connection = connection;
    }

    public void insertOrUpdateVendedor(boolean insert, int codigo, String nombre, float totalVendido) throws SQLException {
        if (insert) {
            cs = connection.prepareCall("{call SP_004(?,?,?)}");
        } else {
            cs = connection.prepareCall("{call SP_005(?,?,?)}");
        }

        cs.setInt(1, codigo);
        cs.setString(2, nombre);
        cs.setFloat(3, totalVendido);
        cs.executeQuery();
        cs.close();
    }

    public void updateVendedor(int codigo, String nombre, float totalVendido) throws SQLException {

        cs.setInt(1, codigo);
        cs.setString(2, nombre);
        cs.setFloat(3, totalVendido);
        cs.executeUpdate();
        cs.close();
    }

    public void deleteVendedor(int codigo) throws SQLException {
        cs = connection.prepareCall("{call SP_006(?)}");
        cs.setInt(1, codigo);
        cs.executeUpdate();
        cs.close();
    }

    public Object[] selectVendedor(int codigo) throws SQLException {
        this.connection.setAutoCommit(false);
        Object[] result = new Object[3];
        cs = connection.prepareCall("{? = call FS_002(?)}");
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
            result[2] = rs.getFloat("TotalVendido");
        }
        cs.close();
        this.connection.setAutoCommit(true);
        return result;
    }

    public Object[][] selectTodoVendedor() throws SQLException {
        this.connection.setAutoCommit(false);
        cs = connection.prepareCall("{? = call FS_007()}");
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
            result[count][2] = rs.getFloat("TotalVendido");
            count++;
        }
        cs.close();
        this.connection.setAutoCommit(true);
        return result;
    }

    public int size() throws SQLException {
        int c=0;
        String cont="";
        Statement stm = connection.createStatement();
        ResultSet s = stm.executeQuery("Select COUNT(*) From Vendedores");
        if (connection.getMetaData().getURL().equals("jdbc:oracle:thin:@localhost:1521:xe")){
            cont = "COUNT(*)";
        } else {
            cont = "Count";
        }
        while(s.next()){
            c=s.getInt(cont);
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
