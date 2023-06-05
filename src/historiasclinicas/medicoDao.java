
package historiasclinicas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class medicoDao {
    public DefaultTableModel listar(Connection con,String buscar) {
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs;
        modelo.addColumn("idmedico");
        modelo.addColumn("nombres");
        modelo.addColumn("apellidos");
        modelo.addColumn("especialidad");
        try {
            rs = con.createStatement().executeQuery("select * from medico where nombres like '%'+buscar+'%' or apellidos like '%'+ buscar+'%'");
            while (rs.next()) {
                Object fila[] = new Object[4];
                for (int i = 0; i < 4; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error(listar):" + ex);
        }
        return modelo;
    }

    public boolean Insertar(Connection con, medico  e) {
        boolean result = false;
        PreparedStatement stmt;
        try {
            stmt =con.prepareStatement("insert into medico(idmedico,nombres,"
                    + "apellidos,especialidad) "
                    + "values (?,?,?,? ");
            stmt.setInt(1, e.getId_medico());
            stmt.setString(2, e.getNombres());
            stmt.setString(3, e.getApellidos());
            stmt.setString(4, e.getEspecialidad());
            stmt.execute();
            result = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar el registro:\n" + ex);
        }
        return result;
    }

    public void Modificar(Connection con, medico e) {
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement("UPDATE medico set nombres=?, apellidos=?, especialidad=?,   where idmedico=?");
            stmt.setInt(1, e.getId_medico());
            stmt.setString(2, e.getNombres());
            stmt.setString(3, e.getApellidos());
            stmt.setString(4, e.getEspecialidad());
            stmt.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar In" + ex);
        }
    }

    public void Eliminar(Connection con, int id_medico) {
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement("delete from medico where idmedico=? ");
            stmt.setInt(1, id_medico);
            stmt.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al eliminar In" + ex);
        }
    }

}

