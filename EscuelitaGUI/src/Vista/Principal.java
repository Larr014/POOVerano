package Vista;

import DAO.DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larr0
 */
public class Principal extends javax.swing.JFrame {
    public DAO d;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        d = new DAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mAgregarAsignatura = new javax.swing.JMenuItem();
        mBuscarAsignatura = new javax.swing.JMenuItem();
        mEliminarAsignatura = new javax.swing.JMenuItem();
        mActualizarAsignatura = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Asignatura");

        mAgregarAsignatura.setText("Agregar Asignatura");
        mAgregarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAgregarAsignaturaActionPerformed(evt);
            }
        });
        jMenu1.add(mAgregarAsignatura);

        mBuscarAsignatura.setText("Buscar Asignatura");
        mBuscarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBuscarAsignaturaActionPerformed(evt);
            }
        });
        jMenu1.add(mBuscarAsignatura);

        mEliminarAsignatura.setText("Eliminar Asignatura");
        mEliminarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEliminarAsignaturaActionPerformed(evt);
            }
        });
        jMenu1.add(mEliminarAsignatura);

        mActualizarAsignatura.setText("Actualizar Asignatura");
        mActualizarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActualizarAsignaturaActionPerformed(evt);
            }
        });
        jMenu1.add(mActualizarAsignatura);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mBuscarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBuscarAsignaturaActionPerformed
       BuscarAsignatura ba = new BuscarAsignatura(d);
       ba.setVisible(true);
    }//GEN-LAST:event_mBuscarAsignaturaActionPerformed

    private void mAgregarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAgregarAsignaturaActionPerformed
        AgregarAsignatura aa = new AgregarAsignatura(d);
        aa.setVisible(true);
    }//GEN-LAST:event_mAgregarAsignaturaActionPerformed

    private void mEliminarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEliminarAsignaturaActionPerformed
        EliminarAsignatura ea = new EliminarAsignatura(d);
        ea.setVisible(true);
        
    }//GEN-LAST:event_mEliminarAsignaturaActionPerformed

    private void mActualizarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActualizarAsignaturaActionPerformed
       ActualizarAsignatura as = new ActualizarAsignatura(d);
       as.setVisible(true);
    }//GEN-LAST:event_mActualizarAsignaturaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mActualizarAsignatura;
    private javax.swing.JMenuItem mAgregarAsignatura;
    private javax.swing.JMenuItem mBuscarAsignatura;
    private javax.swing.JMenuItem mEliminarAsignatura;
    // End of variables declaration//GEN-END:variables
}
