
package historiasclinicas;

import java.sql.Connection;


public class frmmedico extends javax.swing.JFrame {

     Connection con;
    public frmmedico() {
        initComponents();
        con=new Conexion().getCon();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtidmedico = new javax.swing.JTextField();
        ccomboes = new javax.swing.JComboBox<>();
        txtapellido = new javax.swing.JTextField();
        btinsertar = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblm = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btbuscar = new javax.swing.JButton();
        btedi = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtidmedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 50, -1));

        ccomboes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ccomboes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Especialidad", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ccomboes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 110, -1));

        btinsertar.setIcon(new javax.swing.ImageIcon("C:\\Users\\TOSHIBA\\Downloads\\iconfinder_floppy_285657.png")); // NOI18N
        btinsertar.setText("Insertar ");
        btinsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btinsertarActionPerformed(evt);
            }
        });
        getContentPane().add(btinsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 110, -1));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\Notas2\\src\\iconos\\iconfinder_exit_28363.png")); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, 40));

        tblm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID-MEDICO", "Nombres", "Apellidos", "Especialidad"
            }
        ));
        jScrollPane1.setViewportView(tblm);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 90));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("apellidos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 90, -1));

        btbuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\TOSHIBA\\Downloads\\iconfinder_icon-101-folder-search_314678.png")); // NOI18N
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 40, 30));

        btedi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconfinder_icon-136-document-edit_314724 (1).png"))); // NOI18N
        btedi.setText("Editar");
        btedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btediActionPerformed(evt);
            }
        });
        getContentPane().add(btedi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Nombres ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("ID medico");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\Notas2\\src\\iconos\\iconfinder_edit-delete_23231.png")); // NOI18N
        jButton3.setText("Eliminar ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, 40));

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Medico");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 100, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\servicio-de-salud.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btinsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btinsertarActionPerformed
     medico e = new medico();
        medicoDao ed = new medicoDao();
        e.setId_medico(Integer.parseInt(txtidmedico.getText()));
        e.setNombres(txtnombre.getText());
        e.setApellidos(txtapellido.getText());
        e.setEspecialidad(String.valueOf(ccomboes.getSelectedItem()));
        ed.Insertar(con, e);
        tblm.setModel(new medicoDao().listar(con,txtbuscar.getText()));        
    }//GEN-LAST:event_btinsertarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btediActionPerformed
        medico p= new medico();
       p.setId_medico(Integer.parseInt(txtidmedico.getText()));
       p.setNombres(txtnombre.getText());
       p.setApellidos(txtapellido.getText());      
       p.setEspecialidad(String.valueOf(ccomboes.getSelectedItem())); 
       medicoDao obj=new medicoDao();
       obj.Modificar(con, p);
       tblm.setModel(new medicoDao().listar(con, txtbuscar.getText())); //ya
    }//GEN-LAST:event_btediActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       medicoDao ed = new medicoDao();
        int id = Integer.parseInt(txtidmedico.getText());
        ed.Eliminar(con, id);
        tblm.setModel(new medicoDao().listar(con,txtbuscar.getText()));

    }//GEN-LAST:event_jButton3ActionPerformed

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        tblm.setModel(new medicoDao().listar(con,txtbuscar.getText()));
    }//GEN-LAST:event_btbuscarActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmmedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmmedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmmedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmmedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmmedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton btedi;
    private javax.swing.JButton btinsertar;
    private javax.swing.JComboBox<String> ccomboes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblm;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtidmedico;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
