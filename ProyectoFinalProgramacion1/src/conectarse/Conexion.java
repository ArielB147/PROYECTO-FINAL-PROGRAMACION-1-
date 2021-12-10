
package conectarse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection getConnection() {

        String conexionURL = "jdbc:sqlserver://localhost:1433;"
                + "database=ProyectoFinal;"
                + "user=ArielBB2;"
                + "password=147;"
                + "loginTimeout=30;";
        try {
            Connection con = DriverManager.getConnection(conexionURL);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
}
