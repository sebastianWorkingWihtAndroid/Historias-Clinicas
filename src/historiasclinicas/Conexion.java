
package historiasclinicas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Conexion {
    Connection con;

    public Conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/hospital";
            con = DriverManager.getConnection(url, "root","");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexión. Compruebe"
                    + " la configuración del servidor y la base de datos \n" + ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se encuentra el driver MySQL ");
        }
    }

    public Connection getCon() {
        return con;
    }

    public boolean testCon() {
        return con != null;
    }

}

