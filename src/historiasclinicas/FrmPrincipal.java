
package historiasclinicas;


public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemsalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        historia = new javax.swing.JMenuItem();
        paciente = new javax.swing.JMenuItem();
        Medico = new javax.swing.JMenuItem();
        seguridad = new javax.swing.JMenu();
        itemusuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Archivo");

        itemsalir.setText("Salir");
        itemsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsalirActionPerformed(evt);
            }
        });
        jMenu1.add(itemsalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Hospital");

        historia.setText("Historia");
        historia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historiaActionPerformed(evt);
            }
        });
        jMenu2.add(historia);

        paciente.setText("Paciente");
        paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteActionPerformed(evt);
            }
        });
        jMenu2.add(paciente);

        Medico.setText("Medico");
        Medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicoActionPerformed(evt);
            }
        });
        jMenu2.add(Medico);

        jMenuBar1.add(jMenu2);

        seguridad.setText("Seguridad");

        itemusuario.setText("Usuario");
        itemusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemusuarioActionPerformed(evt);
            }
        });
        seguridad.add(itemusuario);

        jMenuBar1.add(seguridad);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicoActionPerformed
         frmmedico a=new frmmedico();
        a.setVisible(true);
    }//GEN-LAST:event_MedicoActionPerformed

    private void historiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historiaActionPerformed
         frmhistoria a=new frmhistoria();
        a.setVisible(true);
    }//GEN-LAST:event_historiaActionPerformed

    private void pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteActionPerformed
        Frmpaciente a=new Frmpaciente();
        a.setVisible(true);
    }//GEN-LAST:event_pacienteActionPerformed

    private void itemusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemusuarioActionPerformed
        
    }//GEN-LAST:event_itemusuarioActionPerformed

    private void itemsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsalirActionPerformed
       dispose();
    }//GEN-LAST:event_itemsalirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Medico;
    private javax.swing.JMenuItem historia;
    private javax.swing.JMenuItem itemsalir;
    private javax.swing.JMenuItem itemusuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem paciente;
    private javax.swing.JMenu seguridad;
    // End of variables declaration//GEN-END:variables
}
