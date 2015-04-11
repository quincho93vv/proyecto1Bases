package Modelo;

public class OracleConexionHandler {
    String jdbcUrl;
    String user;
    String password;
    
    public OracleConexionHandler(String user, String pass){
        this.jdbcUrl = "jdbc:oracle:thin:@localhost:1521:ORCL";
        this.user = user;
        this.password = pass;
    }
    
}
