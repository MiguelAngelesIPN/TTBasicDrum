/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelos.Usuario;
import Servicios.Conexion;
import Servicios.OperacionesUsuario;
import Vistas.Administrador.MenuAdmin;
import Vistas.Alumno.MenuAlumno;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class IniciarSesion extends javax.swing.JFrame {
    private Conexion conexion;
    private Usuario usuario;
    private OperacionesUsuario operaciones;
    /**
     * Creates new form IniciarSesion
     */
    public IniciarSesion() {
        initComponents();
    }

    public IniciarSesion(Conexion conexion,Usuario usuario) {
        initComponents();
        this.conexion=conexion;
        this.usuario=usuario;
        this.operaciones=new OperacionesUsuario(this.conexion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLogo = new javax.swing.JPanel();
        NombrePrograma = new javax.swing.JLabel();
        ImagenPrograma = new javax.swing.JLabel();
        PanelIniciarSesion = new javax.swing.JPanel();
        Cerrar = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        IniciarSesion = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        JTextUsuario = new javax.swing.JTextField();
        Contraseña = new javax.swing.JLabel();
        JTextContraseña = new javax.swing.JPasswordField();
        BotonIniciar = new javax.swing.JButton();
        Pregunta = new javax.swing.JLabel();
        Registrate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesion");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        PanelLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombrePrograma.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        NombrePrograma.setForeground(new java.awt.Color(255, 255, 255));
        NombrePrograma.setLabelFor(ImagenPrograma);
        NombrePrograma.setText("BasicDrum");
        PanelLogo.add(NombrePrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, 50));

        ImagenPrograma.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        ImagenPrograma.setForeground(new java.awt.Color(255, 255, 255));
        ImagenPrograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Fondo Bateria.jpg"))); // NOI18N
        ImagenPrograma.setText("BasicDrum");
        PanelLogo.add(ImagenPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 460, 540));

        PanelIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8_Multiply_32px.png"))); // NOI18N
        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8_Expand_Arrow_32px.png"))); // NOI18N
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });

        IniciarSesion.setFont(new java.awt.Font("Verdana", 0, 28)); // NOI18N
        IniciarSesion.setText("Iniciar sesión");

        Usuario.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        Usuario.setText("Correo electrónico");

        JTextUsuario.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        JTextUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Contraseña.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        Contraseña.setText("Contraseña");

        JTextContraseña.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        BotonIniciar.setBackground(new java.awt.Color(0, 51, 204));
        BotonIniciar.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        BotonIniciar.setForeground(new java.awt.Color(255, 255, 255));
        BotonIniciar.setText("Ingresar");
        BotonIniciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        BotonIniciar.setBorderPainted(false);
        BotonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarActionPerformed(evt);
            }
        });

        Pregunta.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Pregunta.setText("¿Aún no eres usuario?");

        Registrate.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Registrate.setForeground(new java.awt.Color(0, 0, 204));
        Registrate.setText("Registrate");
        Registrate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelIniciarSesionLayout = new javax.swing.GroupLayout(PanelIniciarSesion);
        PanelIniciarSesion.setLayout(PanelIniciarSesionLayout);
        PanelIniciarSesionLayout.setHorizontalGroup(
            PanelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIniciarSesionLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(PanelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIniciarSesionLayout.createSequentialGroup()
                        .addGroup(PanelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PanelIniciarSesionLayout.createSequentialGroup()
                                    .addGap(79, 79, 79)
                                    .addGroup(PanelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIniciarSesionLayout.createSequentialGroup()
                                            .addComponent(IniciarSesion)
                                            .addGap(67, 67, 67))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIniciarSesionLayout.createSequentialGroup()
                                            .addComponent(Contraseña)
                                            .addGap(94, 94, 94))))
                                .addComponent(JTextContraseña)
                                .addComponent(BotonIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PanelIniciarSesionLayout.createSequentialGroup()
                                .addComponent(Pregunta)
                                .addGap(11, 11, 11)
                                .addComponent(Registrate)
                                .addGap(13, 13, 13))
                            .addComponent(Minimizar)
                            .addComponent(JTextUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(Cerrar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIniciarSesionLayout.createSequentialGroup()
                        .addComponent(Usuario)
                        .addGap(107, 107, 107))))
        );
        PanelIniciarSesionLayout.setVerticalGroup(
            PanelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIniciarSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Minimizar)
                    .addComponent(Cerrar))
                .addGap(83, 83, 83)
                .addComponent(IniciarSesion)
                .addGap(18, 18, 18)
                .addComponent(Usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Contraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BotonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pregunta)
                    .addComponent(Registrate))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(PanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        // TODO add your handling code here:
        int opcion=JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?","Salir",JOptionPane.YES_NO_OPTION);
        if(opcion==JOptionPane.YES_OPTION){
            System.exit(0);
        }
        
    }//GEN-LAST:event_CerrarMouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void RegistrateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrateMouseClicked
        // TODO add your handling code here:
        dispose();
        Registrarse registrarse=new Registrarse(conexion);
        registrarse.setVisible(true);
    }//GEN-LAST:event_RegistrateMouseClicked

    private void BotonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarActionPerformed
        // TODO add your handling code here:
        try {
            String email=JTextUsuario.getText();
            String password=new String(JTextContraseña.getPassword());
            if(email.equals("")||password.equals("")){
                JOptionPane.showMessageDialog(this, "Debe ingresar correo electronico y contraseña","Datos incompletos",JOptionPane.ERROR_MESSAGE);
            }
            else{
                String comando="select*from usuario where email='"+email+"' and contraseña='"+password+"'";
                ResultSet busqueda=conexion.Consultar(comando);
                if(busqueda.next()){
                    Usuario usuario=new Usuario((Integer)busqueda.getInt("Id"),(String)busqueda.getString("Nombre"),(String)busqueda.getString("contraseña"),(String)busqueda.getString("tipo"),"activo",(String)busqueda.getString("email"));
                    operaciones.IniciarSesion(usuario);
                    if(usuario.getTipo().equals("admin")){
                        System.out.println("Usuario administrador");
                        MenuAdmin vista=new MenuAdmin(conexion,usuario);
                        vista.setVisible(true);
                    }
                    else if(usuario.getTipo().equals("alumno")){
                        System.out.println("Usuario alumno");
                        MenuAlumno vista=new MenuAlumno(conexion,usuario);
                        vista.setVisible(true);
                    }
                    else{
                        System.out.println("Tipo de usuario no identificado");
                        System.exit(1);
                    }
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(this, "El usuario o la contraseña no es correcta, verifique nuevamente","Usuario no valido",JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(IniciarSesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIniciar;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel ImagenPrograma;
    private javax.swing.JLabel IniciarSesion;
    private javax.swing.JPasswordField JTextContraseña;
    private javax.swing.JTextField JTextUsuario;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel NombrePrograma;
    private javax.swing.JPanel PanelIniciarSesion;
    private javax.swing.JPanel PanelLogo;
    private javax.swing.JLabel Pregunta;
    private javax.swing.JLabel Registrate;
    private javax.swing.JLabel Usuario;
    // End of variables declaration//GEN-END:variables
}
