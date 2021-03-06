/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Datos.DatosVenta;
import Logica.Venta;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class frmVenta extends javax.swing.JDialog {

    Venta ventaObj = new Venta();
    DefaultTableModel modelo;
    int posi;
    DatosVenta almacenaVent = new DatosVenta(20);

    /**
     * Creates new form frmVenta
     */
    public frmVenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVenta = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int vColIndex){
                return false;
            }};
            jPanel1 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            txtBuscar = new javax.swing.JTextField();
            cmbbusca = new javax.swing.JComboBox<>();
            btnagregar = new javax.swing.JButton();
            btnactualizar = new javax.swing.JButton();
            btneliminar = new javax.swing.JButton();
            lblregistro = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

            tblVenta.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
            ));
            jScrollPane1.setViewportView(tblVenta);

            jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

            jLabel1.setText("Buscar por:");

            txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    txtBuscarKeyReleased(evt);
                }
            });

            cmbbusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NumerVent", "Hora", "NumerProgr", "Fecha" }));

            btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-agregar-archivo-48.png"))); // NOI18N
            btnagregar.setText("Agregar");
            btnagregar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnagregarActionPerformed(evt);
                }
            });

            btnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-editar-archivo-48.png"))); // NOI18N
            btnactualizar.setText("Actulizar");
            btnactualizar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnactualizarActionPerformed(evt);
                }
            });

            btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-eliminar-48.png"))); // NOI18N
            btneliminar.setText("Eliminar");
            btneliminar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btneliminarActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cmbbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnagregar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnactualizar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btneliminar)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnagregar)
                        .addComponent(btnactualizar)
                        .addComponent(btneliminar))
                    .addContainerGap(19, Short.MAX_VALUE))
            );

            lblregistro.setText("Total de registro:");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(581, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap()))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(528, Short.MAX_VALUE)
                    .addComponent(lblregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(67, Short.MAX_VALUE)))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
        String titulos[] = {"NumerVent", "Hora", "NumerProgr", "Fecha"};
        modelo = new DefaultTableModel(null, titulos);
        for (int i = 0; i < almacenaVent.getNumRegs(); i++) {
            ventaObj = almacenaVent.getRegistro(i);
            switch (cmbbusca.getSelectedIndex()) {
                case 0:
                    if (String.valueOf(ventaObj.getNumerVent()).contains(txtBuscar.getText())) {
                        Object nuevaFila[] = {ventaObj.getNumerVent(), ventaObj.getHora(), ventaObj.getNumProg(), ventaObj.getFecha()};
                        modelo.addRow(nuevaFila);
                    }
                    break;
                case 1:
                    if (String.valueOf(ventaObj.getHora()).contains(txtBuscar.getText())) {
                        Object nuevaFila[] = {ventaObj.getNumerVent(), ventaObj.getHora(), ventaObj.getNumProg(), ventaObj.getFecha()};
                        modelo.addRow(nuevaFila);
                    }
                    break;
                case 2:
                    if (String.valueOf(ventaObj.getNumProg()).contains(txtBuscar.getText())) {
                        Object nuevaFila[] = {ventaObj.getNumerVent(), ventaObj.getHora(), ventaObj.getNumProg(), ventaObj.getFecha()};
                        modelo.addRow(nuevaFila);
                    }
                    break;
                case 3:
                    if (String.valueOf(ventaObj.getFecha()).contains(txtBuscar.getText())) {
                        Object nuevaFila[] = {ventaObj.getNumerVent(), ventaObj.getHora(), ventaObj.getNumProg(), ventaObj.getFecha()};
                        modelo.addRow(nuevaFila);
                    }
                    break;
            }
        }
        tblVenta.setModel(modelo);
        lblregistro.setText("Cantidad de Registro " + String.valueOf(modelo.getRowCount()));
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
        frmAgregaVenta win = new frmAgregaVenta(null, true, almacenaVent, -1, 1);
        win.setTitle("Agregar Venta Nueva");
        win.setVisible(true);
        almacenaVent = win.almacenaVent;
        cargaTabla();
    }//GEN-LAST:event_btnagregarActionPerformed
    public void cargaTabla() {
        String titulos[] = {"Número Venta", "Hora", "Número Programa", "Fecha"};
        modelo = new DefaultTableModel(null, titulos);
        for (int i = 0; i < almacenaVent.getNumRegs(); i++) {
            ventaObj = almacenaVent.getRegistro(i);
            Object nuevaFila[] = {ventaObj.getNumerVent(), ventaObj.getHora(), ventaObj.getNumProg(), ventaObj.getFecha()};
            modelo.addRow(nuevaFila);
        }
        tblVenta.setModel(modelo);
        lblregistro.setText("Cantidad de Registros: " + String.valueOf(modelo.getRowCount()));
    }

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(null, "Deseas Actualizar la fila del Vector?");
        if (respuesta == JOptionPane.YES_OPTION) {
            if (tblVenta.getSelectedRow() >= 0) {
                frmAgregaVenta win = new frmAgregaVenta(null, true, almacenaVent, tblVenta.getSelectedRow(), 2);
                win.setTitle("Actualizar Venta");
                win.setVisible(true);
                almacenaVent = win.almacenaVent;
                cargaTabla();
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione lo que quiere Actualizar");
            }
        } else if (respuesta == JOptionPane.NO_OPTION) {

        } else if (respuesta == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "Cancelación con Exito");
        }

    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(null, "Deseas Eliminar la fila del Vector?");
        if (respuesta == JOptionPane.YES_OPTION) {
            if (tblVenta.getSelectedRow() != -1) {
                if (almacenaVent.eliminarVenta(posi, ventaObj)) {
                    JOptionPane.showMessageDialog(this, "Registro Eliminado");
                    modelo.removeRow(tblVenta.getSelectedRow());
                    lblregistro.setText("Cantidad de Registros: " + String.valueOf(modelo.getRowCount()));
                }
            } else {
                JOptionPane.showMessageDialog(this, "No ha Seleccionado una Casilla");
            }
        } else if (respuesta == JOptionPane.NO_OPTION) {

        } else if (respuesta == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "Cancelación con Exito");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

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
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmVenta dialog = new frmVenta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JComboBox<String> cmbbusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblregistro;
    private javax.swing.JTable tblVenta;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
