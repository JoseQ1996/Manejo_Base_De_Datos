/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.vista;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author José Quinde
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaIngreso
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuBuscarPersona = new javax.swing.JMenuItem();
        menuActualizarPersona = new javax.swing.JMenuItem();
        menuEliminarPersona = new javax.swing.JMenuItem();
        menuListarPersonas = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manejo de Archivos Binarios Randomicos con CRUD");

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1167, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );

        jMenu1.setText("Persona");
        jMenu1.setToolTipText("");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Ingresar Persona");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menuBuscarPersona.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        menuBuscarPersona.setText("Buscar Persona");
        menuBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarPersonaActionPerformed(evt);
            }
        });
        jMenu1.add(menuBuscarPersona);

        menuActualizarPersona.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        menuActualizarPersona.setText("Actualizar Persona");
        menuActualizarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActualizarPersonaActionPerformed(evt);
            }
        });
        jMenu1.add(menuActualizarPersona);

        menuEliminarPersona.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuEliminarPersona.setText("Eliminar Persona ");
        menuEliminarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarPersonaActionPerformed(evt);
            }
        });
        jMenu1.add(menuEliminarPersona);

        menuListarPersonas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        menuListarPersonas.setText("Listar Personas");
        menuListarPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarPersonasActionPerformed(evt);
            }
        });
        jMenu1.add(menuListarPersonas);

        jMenuBar1.add(jMenu1);

        menuSalir.setText("Salir");
        menuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSalirMouseClicked(evt);
            }
        });
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        VentanaIngresarPersona vi=new VentanaIngresarPersona();
        vi.setVisible(true);
        DesktopPane.add(vi);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarPersonaActionPerformed
        // TODO add your handling code here:
         VentanaLeerPersona vl=new VentanaLeerPersona();
        vl.setVisible(true);
        DesktopPane.add(vl);
    }//GEN-LAST:event_menuBuscarPersonaActionPerformed

    private void menuActualizarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarPersonaActionPerformed
        // TODO add your handling code here:
         VentanaActualizarPersona vap=new VentanaActualizarPersona();
        vap.setVisible(true);
        DesktopPane.add(vap);
    }//GEN-LAST:event_menuActualizarPersonaActionPerformed

    private void menuListarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarPersonasActionPerformed
        // TODO add your handling code here:
        VentanaListarPersona vlis = null;
        try {
            vlis = new VentanaListarPersona();
        } catch (Exception ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        vlis.setVisible(true);
        DesktopPane.add(vlis);
    }//GEN-LAST:event_menuListarPersonasActionPerformed

    private void menuEliminarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarPersonaActionPerformed
        // TODO add your handling code here:
        VentanaEliminarPersona ve=new VentanaEliminarPersona();
        ve.setVisible(true);
        DesktopPane.add(ve);
    }//GEN-LAST:event_menuEliminarPersonaActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuSalirMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem menuActualizarPersona;
    private javax.swing.JMenuItem menuBuscarPersona;
    private javax.swing.JMenuItem menuEliminarPersona;
    private javax.swing.JMenuItem menuListarPersonas;
    private javax.swing.JMenu menuSalir;
    // End of variables declaration//GEN-END:variables
}
