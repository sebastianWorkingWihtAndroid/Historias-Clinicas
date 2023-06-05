
package historiasclinicas;
import java.sql.Connection;


public class Frmpaciente extends javax.swing.JFrame {
 Connection con;
 
 
    public Frmpaciente() {
        initComponents();
   
        con=new Conexion().getCon();
        
        tblpaciente.setModel(new PacienteDao().listar(con));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txtidpaciente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtdocumento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpaciente = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        comboxsex = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        comboxdoc = new javax.swing.JComboBox<>();
        btinsert = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btedit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("ID paciente");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        getContentPane().add(txtidpaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 50, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Nombres ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        getContentPane().add(txtdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Documento");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        tblpaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID paciente", "Documento", "Tipo documento", "Nombres", "Apellido", "f.nacimiento", "Sexo"
            }
        ));
        jScrollPane1.setViewportView(tblpaciente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 440, 100));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Tipo documento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        comboxsex.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboxsex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "masculino", "femenino", " " }));
        getContentPane().add(comboxsex, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Sexo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("F.nacimiento");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));
        getContentPane().add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 90, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Apellidos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 110, -1));

        comboxdoc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboxdoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C.C", "T.I", " " }));
        getContentPane().add(comboxdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        btinsert.setIcon(new javax.swing.ImageIcon("C:\\Users\\TOSHIBA\\Downloads\\iconfinder_floppy_285657.png")); // NOI18N
        btinsert.setText("Insertar ");
        btinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btinsertActionPerformed(evt);
            }
        });
        getContentPane().add(btinsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 40));

        btsalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\Notas2\\src\\iconos\\iconfinder_exit_28363.png")); // NOI18N
        btsalir.setText("Salir");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, 40));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\Notas2\\src\\iconos\\iconfinder_edit-delete_23231.png")); // NOI18N
        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, 40));

        btedit.setIcon(new javax.swing.ImageIcon("C:\\Users\\TOSHIBA\\Downloads\\iconfinder_icon-136-document-edit_314724.png")); // NOI18N
        btedit.setText("Editar");
        btedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditActionPerformed(evt);
            }
        });
        getContentPane().add(btedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, 40));

        jLabel2.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Paciente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\servicio-de-salud.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btinsertActionPerformed
        Paciente e = new Paciente();
        PacienteDao ed = new PacienteDao();
        e.setId_paciente(Integer.parseInt(txtidpaciente.getText()));
        e.setDocumento(txtdocumento.getText());
        e.setTipo_documento(String.valueOf(comboxdoc.getSelectedItem()));
        e.setNombres(txtnombre.getText());
        e.setApellidos(txtapellido.getText());
        e.setSexo(String.valueOf(comboxsex.getSelectedItem()));
        e.setF_nacimiento(txtfecha.getText());        
        ed.Insertar(con, e);
        tblpaciente.setModel(new PacienteDao().listar(con));
    }//GEN-LAST:event_btinsertActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
       dispose();
    }//GEN-LAST:event_btsalirActionPerformed

    private void bteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditActionPerformed
       Paciente p= new Paciente();
       p.setId_paciente(Integer.parseInt(txtidpaciente.getText()));
       p.setDocumento(txtdocumento.getText());
       p.setTipo_documento(String.valueOf(comboxdoc.getSelectedItem()));
       p.setSexo(String.valueOf(comboxsex.getSelectedItem()));
       p.setF_nacimiento(txtfecha.getText());
       p.setNombres(txtnombre.getText());
       p.setApellidos(txtapellido.getText());
       
       PacienteDao obj=new PacienteDao();
       obj.Modificar(con, p);
       tblpaciente.setModel(new PacienteDao().listar(con)); //ya
    }//GEN-LAST:event_bteditActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         PacienteDao ed = new PacienteDao();
        int id = Integer.parseInt(txtidpaciente.getText());
        ed.Eliminar(con, id);
        tblpaciente.setModel(new PacienteDao().listar(con));

    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frmpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmpaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btedit;
    private javax.swing.JButton btinsert;
    private javax.swing.JButton btsalir;
    private javax.swing.JComboBox<String> comboxdoc;
    private javax.swing.JComboBox<String> comboxsex;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblpaciente;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtidpaciente;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
