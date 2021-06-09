/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Administrador;

import Modelos.Usuario;
import Servicios.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.media.*;
/**
 *
 * @author Miguel Angeles
 */
public class VisualizadorAdmin extends javax.swing.JFrame {
    private Conexion conexion;
    private Usuario usuario;
    private ArrayList<String> ubicacion;
    /**
     * Creates new form VisualizadorAdmin
     */
    public VisualizadorAdmin() {
        initComponents();
    }
    public VisualizadorAdmin(Conexion conexion,Usuario usuario, String ubicacion) throws SQLException{
        initComponents();
        this.conexion=conexion;
        this.usuario=usuario;
        
        System.out.print(ubicacion);
        ResultSet rs=conexion.Consultar("select*from recurso where nombre='"+ubicacion+"'");
        if(rs.next()){
            String tipo=rs.getString("tipo");
            System.out.println(tipo);
        }
        else{
            JOptionPane.showMessageDialog(this, "Error");
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

        Retroceder = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(817, 540));
        setMinimumSize(new java.awt.Dimension(817, 540));
        setUndecorated(true);
        setResizable(false);

        Retroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8_Back_64px.png"))); // NOI18N
        Retroceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetrocederMouseClicked(evt);
            }
        });

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8_Expand_Arrow_32px.png"))); // NOI18N
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8_Multiply_32px.png"))); // NOI18N
        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 689, Short.MAX_VALUE)
                        .addComponent(Retroceder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Minimizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cerrar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Retroceder)
                    .addComponent(Minimizar)
                    .addComponent(Cerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RetrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrocederMouseClicked
        // TODO add your handling code here:
        MenuAdmin vista=new MenuAdmin(conexion,usuario);
        vista.setVisible(true);
        dispose();
    }//GEN-LAST:event_RetrocederMouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        // TODO add your handling code here:
        int opcion=JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?","Salir",JOptionPane.YES_NO_OPTION);
        if(opcion==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_CerrarMouseClicked

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
            java.util.logging.Logger.getLogger(VisualizadorAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizadorAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizadorAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizadorAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VisualizadorAdmin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Retroceder;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
