package historiasclinicas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SEBASTIAN
 */
public class historiaDao {

    public DefaultTableModel listar(Connection con) {
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs;
        modelo.addColumn("N.historia");
        modelo.addColumn("Fecha");
        modelo.addColumn("id_paciente");
        modelo.addColumn("id_medico");
        modelo.addColumn("Motivo");
        modelo.addColumn("Enfactual");
        modelo.addColumn("Diagnostico");
        modelo.addColumn("Tratamiento");
        try {
            rs = con.createStatement().executeQuery("select * from historia");
            while (rs.next()) {
                Object fila[] = new Object[8];
                for (int i = 0; i < 8; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error(listar):" + ex);
        }
        return modelo;
    }

    public boolean Insertar(Connection con, historia e) {
        boolean result = false;
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement("insert into historia(nhistoria,fecha,id_paciente,id_medico,motivo,enfactual"
                    + "diagnostico,tratamiento) "
                    + "values (?,?,?,?,?,?,?,? ");
            stmt.setInt(1, e.getNhistoria());
            stmt.setString(2, e.getFecha());
            stmt.setInt(3, e.getId_paciente());
            stmt.setInt(4, e.getId_medico());
            stmt.setString(5, e.getMotivo());
            stmt.setString(6, e.getEnfactual());
            stmt.setString(7, e.getEnfactual());
            stmt.setString(8, e.getTratamiento());
            stmt.execute();
            result = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar el registro:\n" + ex);
        }
        return result;
    }

    public void Modificar(Connection con, historia e) {
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement("UPDATE historia set fecha=?, id_paciente=?, id_medico=?, motivo=?, enfactual=?, diagnostico=?, tratamiento=?,   where nhistoria=?");
            stmt.setInt(1, e.getNhistoria());
            stmt.setString(2, e.getFecha());
            stmt.setInt(3, e.getId_paciente());
            stmt.setInt(4, e.getId_medico());
            stmt.setString(5, e.getMotivo());
            stmt.setString(2, e.getEnfactual());
            stmt.setString(3, e.getDiagnostico());
            stmt.setString(4, e.getTratamiento());
            stmt.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar In" + ex);
        }
    }

    public void Eliminar(Connection con, int nhistoria) {
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement("delete from historia where nhistoria=? ");
            stmt.setInt(1, nhistoria);
            stmt.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al eliminar In" + ex);
        }
    }

}
