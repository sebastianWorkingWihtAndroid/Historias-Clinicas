package historiasclinicas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsuarioDao {

    public DefaultTableModel listar(Connection con) {
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs;
        modelo.addColumn("Usuario");
        modelo.addColumn("Password");
        

        try {
            rs = con.createStatement().executeQuery("select * from Usuario");
            while (rs.next()) {
                Object fila[] = new Object[5];
                for (int i = 0; i < 5; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error(listar):" + ex);
        }
        return modelo;
    }

    public boolean Insertar(Connection con, usuario e) {
        boolean result = false;
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement("insert into Usuario(Usuario,Password,nombre,"
                    + "Activo,email) "
                    + "values (?,?,?,?,?)");

            stmt.setString(1, e.getUsuario());
            stmt.setString(2, e.getPassword());
            

            stmt.execute();
            result = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar el registro:\n" + ex);
        }
        return result;
    }

    public void Modificar(Connection con, usuario e) {
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement("UPDATE usuario set usuario=?,  password=?, nombre=?, activo=?,email=?,where =?");
            stmt.setString(1, e.getUsuario());
            stmt.setString(2, e.getPassword());
            
            stmt.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar In" + ex);
        }
    }

    public void Eliminar(Connection con, String usuario) {
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement("delete from estudiante where usuario=? ");
            stmt.setString(1,usuario);
            stmt.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al eliminar In" + ex);
        }
    }

     public boolean login(Connection con, String usu, String pass) {
        boolean r = false;
        PreparedStatement stmt;
        ResultSet rs;
        try {
            stmt = con.prepareStatement("select count(*) as cant from usuario where usuario =? and password =?");
            stmt.setString(1, usu);
            stmt.setString(2, pass);
            rs = stmt.executeQuery();
            if (rs.next()) {
                if (rs.getInt("cant") > 0) {
                    r = true;
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al ejercutar la consulta \n " + r);

        }
        return r;
    }

    void Eliminar(Connection con, UsuarioDao ed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
