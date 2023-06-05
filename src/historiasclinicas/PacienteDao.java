
package historiasclinicas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PacienteDao {
    public DefaultTableModel listar(Connection con) {
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs;
        modelo.addColumn("id_paciente");
        modelo.addColumn("documento");
        modelo.addColumn("tipodoc");
        modelo.addColumn("nombres");
        modelo.addColumn("apellidos");
        modelo.addColumn("sexo");
        modelo.addColumn("fnacimiento");
        try {
            rs = con.createStatement().executeQuery("select * from paciente");
            while (rs.next()) {
                Object fila[] = new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error(listar):" + ex);
        }
        return modelo;
    }

    public boolean Insertar(Connection con, Paciente e) {
        boolean result = false;
        PreparedStatement stmt;
        try {
            stmt =con.prepareStatement("insert into paciente(id_paciente,documento,"
                    + "tipo_doc,nombres,apellidos,sexo,fnacimiento) "
                    + "values (?,?,?,?,?,?,?) ");
            stmt.setInt(1, e.getId_paciente());
            stmt.setString(2, e.getDocumento());
            stmt.setString(3, e.getTipo_documento());
            stmt.setString(4, e.getNombres());
            stmt.setString(5, e.getApellidos());
            stmt.setString(6, e.getSexo());
            stmt.setString(7, e.getF_nacimiento());
            stmt.execute();
            result = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar el registro:\n" + ex);
        }
        return result;
    }

    public void Modificar(Connection con, Paciente e) {
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement("UPDATE paciente set documento=?, tipo_doc=?, nombres=?,  apellidos=?, sexo=?, fnacimiento=? where id_paciente=?");
            stmt.setInt(1, e.getId_paciente());
            stmt.setString(2, e.getDocumento());
            stmt.setString(3, e.getTipo_documento());
            stmt.setString(4, e.getNombres());
            stmt.setString(5, e.getApellidos());
            stmt.setString(6, e.getSexo());
            stmt.setString(7, e.getF_nacimiento());
            stmt.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar In" + ex);
        }
    }

    public void Eliminar(Connection con, int id_paciente) {
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement("delete from paciente where id_paciente=? ");
            stmt.setInt(1, id_paciente);
            stmt.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al eliminar In" + ex);
        }
    }

}
