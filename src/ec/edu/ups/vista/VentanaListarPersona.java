/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.controlador.ControladorPersonadb;
import ec.edu.ups.modelo.Persona;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Set;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class VentanaListarPersona extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaListarPersona
     */
    public static String cedula;
    public static NuevoModelo modelo;
    public VentanaListarPersona() throws Exception {
        initComponents();
         modelo = new NuevoModelo();
        Object[] columnas ={"NOMBRES","APELLIDOS","CEDULA","EDAD","FECHA DE NACIMIENTO","CELULAR","SALARIO"};
        modelo.setColumnIdentifiers(columnas);
        tblPersonas.setModel(modelo);
        llenarTabla();
         tblPersonas.addMouseListener(new MouseAdapter() {
          public void mousePressed(MouseEvent Mouse_evt) {
          JTable table =(JTable) Mouse_evt.getSource();
          Point point = Mouse_evt.getPoint();
          int filaSeleccionada = table.rowAtPoint(point);
          if (Mouse_evt.getClickCount() == 2) {
          cedula = tblPersonas.getValueAt(filaSeleccionada, 2).toString();
            VentanaListarDirecciones vl=new VentanaListarDirecciones();
            VentanaPrincipal.DesktopPane.add(vl);
            vl.setVisible(true);
          }
          }
          });
            
          
        
    }
    /**
     * Llena los datos de la tabla con las personas de la base de datos
     * @throws Exception 
     */
    public void llenarTabla() throws Exception{
    ControladorPersonadb cp=new ControladorPersonadb();
    Set<Persona> Lista =cp.listaPersonas();
    for(Persona persona : Lista){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String fecha=formatter.format(persona.getFechaNacimiento());
        Object[] datos = {persona.getNombres(),
            persona.getApellidos(),
            persona.getCedula(),
            persona.getEdad(),
            fecha,
            persona.getNumeroTelefono(),
            persona.getSalario()};
        modelo.addRow(datos);
    }
}
    /**
      * Metodo para que la tabla no sea editable
      */
     public class NuevoModelo extends DefaultTableModel{
    /**
     * Define la posibilidad de editar las columnas
     */    
    public final boolean [] TblColums= {false,false,false,false,false,false,false};

        @Override
        public boolean isCellEditable(int row, int column) {
            return this.TblColums[column];
        }
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Listar Personas");

        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRES", "APELLIDOS", "CEDULA", "EDAD", "FECHA DE NACIMIENTO", "CELULAR", "SALARIO"
            }
        ));
        tblPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPersonasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblPersonas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonasMouseClicked
        // TODO add your handling code here:

      if(evt.getClickCount()==2){
          int filaSeleccionada = tblPersonas.getSelectedRow();
        if (filaSeleccionada >= 0) {
            cedula = tblPersonas.getValueAt(filaSeleccionada, 2).toString();
            VentanaListarDirecciones vl=new VentanaListarDirecciones();
            VentanaPrincipal.DesktopPane.add(vl);
            vl.setVisible(true);
          }
          }
 
    }//GEN-LAST:event_tblPersonasMouseClicked

    private void tblPersonasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonasMousePressed
        // TODO add your handling code here:
       
          
    }//GEN-LAST:event_tblPersonasMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPersonas;
    // End of variables declaration//GEN-END:variables
}
