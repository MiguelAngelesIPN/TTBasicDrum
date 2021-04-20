package Servicios;

import Modelos.Usuario;
import java.sql.SQLException;

public class OperacionesUsuario {
    private Conexion conexion;
    public OperacionesUsuario(Conexion conexion){
        this.conexion=conexion;
    }
    
    public void IniciarSesion(Usuario usuario) throws SQLException{
        String comando="update usuario set estado='activo' where email='"+usuario.getEmail()+"'";
        conexion.Actualizar(comando);
    }
    
    public void CerrarSesion(Usuario usuario) throws SQLException{
        String comando="update usuario set estado='inactivo' where email='"+usuario.getEmail()+"'";
        conexion.Actualizar(comando);
    }
}
