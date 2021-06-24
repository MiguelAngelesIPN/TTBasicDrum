/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Administrador;

import Modelos.Usuario;
import Servicios.Conexion;
import Servicios.OperacionesUsuario;
import Vistas.IniciarSesion;
import java.awt.HeadlessException;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Miguel Angeles
 */
public class AgregarTemas extends javax.swing.JFrame {
    private Conexion conexion;
    private Usuario usuario;
    private OperacionesUsuario operaciones;
    private File[] archivos;
    /**
     * Creates new form AgregarEjercicios
     */
    public AgregarTemas() {
        initComponents();
    }
    
    public AgregarTemas(Conexion conexion,Usuario usuario) throws SQLException {
        initComponents();
        this.conexion=conexion;
        this.usuario=usuario;
        this.operaciones=new OperacionesUsuario(conexion);
        String nombre=usuario.getNombre();
        jLabel5.setText(nombre);
        jComboBox1.removeAllItems();
        Instrumentos();
        archivos=null;
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonCerrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Retroceder = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(470, 540));
        jPanel1.setMinimumSize(new java.awt.Dimension(470, 540));
        jPanel1.setPreferredSize(new java.awt.Dimension(470, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bienvenid@");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Aqui va el nombre del usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 470, -1));

        jButtonCerrar.setBackground(new java.awt.Color(0, 51, 204));
        jButtonCerrar.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jButtonCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCerrar.setText("Cerrar sesión");
        jButtonCerrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCerrar.setDefaultCapable(false);
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 240, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Fondo Bateria.jpg"))); // NOI18N
        jLabel3.setText("Aqui va el nombre del usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 540));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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

        jComboBox1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Seleccione el instrumento:");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Ingrese el nombre del tema:");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jButton3.setText("Crear tema");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setText("Seleccione los recursos:");

        jButton4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton4.setText("Seleccionar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(Retroceder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Minimizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cerrar))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jButton4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(92, 92, 92))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Retroceder)
                    .addComponent(Minimizar)
                    .addComponent(Cerrar))
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(66, 66, 66)
                .addComponent(jButton3)
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Instrumentos() throws SQLException{
        String comando="select nombre from instrumento";
        ResultSet rs=conexion.Consultar(comando);
        while(rs.next()){
            jComboBox1.addItem(rs.getString("nombre"));    
        }
    }
    
    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        try {
            // TODO add your handling code here:
            operaciones.CerrarSesion(usuario);
            IniciarSesion vista=new IniciarSesion(conexion,null);
            dispose();
            vista.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PracticarAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void RetrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrocederMouseClicked
        // TODO add your handling code here:
        AdministrarTemas vista=new AdministrarTemas(conexion,usuario);
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String tema=jTextField1.getText();
        if(archivos==null||tema.equals("")){
            JOptionPane.showMessageDialog(this, "Por favor complete los datos.");
        }
        else{
            try {
                String instrumento=jComboBox1.getSelectedItem().toString();
                String nombreEjercicio=jTextField1.getText();
                ResultSet rs1=conexion.Consultar("select*from instrumento where nombre='"+instrumento+"'");
                ResultSet rs2=conexion.Consultar("select*from tema where nombre='"+tema+"'");
                rs1.next();
                int idInstrumento=rs1.getInt("idInstrumento");
                if(!rs2.next()){
                    String Descripcion=JOptionPane.showInputDialog(this,"Ingrese una breve descripción del tema:");
                    conexion.Insertar("insert into tema(nombre,descripción) values ('"+tema+"','"+Descripcion+"')");
                    rs2=conexion.Consultar("select*from tema where nombre='"+tema+"'");
                    rs2.next();
                }
                int idTema=rs2.getInt("idTema");
                for (File archivo : archivos) {
                    int index = archivo.getName().lastIndexOf('.');
                    String tipo = archivo.getName().substring(index+1);
                    System.out.println(tipo);
                    String directorio = archivo.getAbsolutePath();
                    String replace = directorio.replace("\\","\\\\");
                    ResultSet rs4=conexion.Consultar("select*from recurso where nombre='"+nombreEjercicio+"' and ubicacion='"+replace+"'");
                    if(!rs4.next()){
                        conexion.Insertar("insert into recurso(tipo,nombre,ubicacion,tema_idtema) values('"+tipo+"','"+nombreEjercicio+"','"+replace+"',"+idTema+")");
                    }
                }
                ResultSet temainstrumento=conexion.Consultar("select * from temainstrumento where instrumento_idinstrumento="+idInstrumento+" and tema_idTema="+idTema);
                if(!temainstrumento.next()){
                    conexion.Insertar("insert into temainstrumento(instrumento_idinstrumento,tema_idTema) values("+idInstrumento+","+idTema+")");
                }
                JOptionPane.showMessageDialog(this, "Tema agregado correctamente");
                Administrar vista=new Administrar(conexion,usuario);
                vista.setVisible(true);
                dispose();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al insertar los datos, intente nuevamente.");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser=new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        FileNameExtensionFilter filter=new FileNameExtensionFilter("Imagen","jpg","png","gif","mp4","wmv","3gp");
        chooser.setFileFilter(filter);
        int abrir=chooser.showOpenDialog(this);
        if(abrir==0){
            archivos=chooser.getSelectedFiles();
        }
        else{
            JOptionPane.showMessageDialog(this, "No se seleccionó ningun archivo");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarTemas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Retroceder;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
