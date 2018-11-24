/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Datos.DatosSala;
import Logica.Sala;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class frmSala extends javax.swing.JDialog {

    DefaultTableModel modelo;
    DatosSala almacenaSala = new DatosSala(20);
    Sala salaObj = new Sala();
    int posi;

    /**
     * Creates new form frmSala
     */
    public frmSala(java.awt.Frame parent, boolean modal) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        cmbbusca = new javax.swing.JComboBox<>();
        btnagregar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSala = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int vColIndex){
                return false;
            }};
            lblregistro = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setTitle("Gestión de Sala");

            jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

            jLabel1.setText("Buscar por:");

            txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    txtBuscarKeyReleased(evt);
                }
            });

            cmbbusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Sala ", "Butacas" }));

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

            tblSala.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
            ));
            jScrollPane1.setViewportView(tblSala);

            lblregistro.setText("Total de registro:");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lblregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 18, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
        frmAgregaSala win = new frmAgregaSala(null, true, almacenaSala, -1, 1);
        win.setTitle("Agregar Sala Nueva");
        win.setVisible(true);
        almacenaSala = win.almacenaSala;
        cargaTabla();

    }//GEN-LAST:event_btnagregarActionPerformed
    public void cargaTabla() {
        String titulos[] = {"ID Sala", "Cantidad de Butacas"};
        modelo = new DefaultTableModel(null, titulos);
        for (int i = 0; i < almacenaSala.getNumRegs(); i++) {
            salaObj = almacenaSala.getRegistro(i);
            Object nuevaFila[] = {salaObj.getIdSala(), salaObj.getCantButacas()};
            modelo.addRow(nuevaFila);
        }
        tblSala.setModel(modelo);
        lblregistro.setText("Cantidad de Registros: " + String.valueOf(modelo.getRowCount()));
    }
    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
        String titulos[] = {"ID Sala", "Cantidad de Butacas"};
        modelo = new DefaultTableModel(null, titulos);
        for (int i = 0; i < almacenaSala.getNumRegs(); i++) {
            salaObj = almacenaSala.getRegistro(i);
            switch (cmbbusca.getSelectedIndex()) {
                case 0:
                    if (String.valueOf(salaObj.getIdSala()).contains(txtBuscar.getText())) {
                        Object nuevaFila[] = {salaObj.getIdSala(), salaObj.getCantButacas()};
                        modelo.addRow(nuevaFila);
                    }
                    break;
                case 1:
                    if (String.valueOf(salaObj.getCantButacas()).contains(txtBuscar.getText())) {
                        Object nuevaFila[] = {salaObj.getIdSala(), salaObj.getCantButacas()};
                        modelo.addRow(nuevaFila);
                    }
                    break;
            }
        }
        tblSala.setModel(modelo);
        lblregistro.setText("Cantidad de Registro " + String.valueOf(modelo.getRowCount()));
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(null, "Deseas Actualizar la fila del Vector?");
        if (respuesta == JOptionPane.YES_OPTION) {
            if (tblSala.getSelectedRow() >= 0) {
                frmAgregaSala win = new frmAgregaSala(null, true, almacenaSala, tblSala.getSelectedRow(), 2);
                win.setTitle("Actualizar Sala");
                win.setVisible(true);
                almacenaSala = win.almacenaSala;
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
            if (tblSala.getSelectedRow() != -1) {
                if (almacenaSala.eliminarSala(posi, salaObj)) {
                    JOptionPane.showMessageDialog(this, "Registro Eliminado");
                    modelo.removeRow(tblSala.getSelectedRow());
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
            java.util.logging.Logger.getLogger(frmSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmSala dialog = new frmSala(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable tblSala;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
