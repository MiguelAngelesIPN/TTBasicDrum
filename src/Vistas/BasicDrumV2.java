package Vistas;

import Modelos.Usuario;
import Servicios.Conexion;
import Vistas.Administrador.MenuAdmin;
import Vistas.Alumno.MenuAlumno;
import java.sql.SQLException;

public class BasicDrumV2 {
    public static void main(String[] args) throws SQLException {
        Conexion conexion=new Conexion();
        Usuario conectado=conexion.UsuarioConectado();
        if(conectado.getID()==null){
            System.out.println("No hay usuario conectado");
            IniciarSesion vista=new IniciarSesion(conexion,null);
            vista.setVisible(true);
        }
        else{
            if(conectado.getTipo().equals("admin")){
                System.out.println("Usuario administrador");
                MenuAdmin vista=new MenuAdmin(conexion,conectado);
                vista.setVisible(true);
            }
            else if(conectado.getTipo().equals("alumno")){
                System.out.println("Usuario alumno");
                MenuAlumno vista=new MenuAlumno(conexion,conectado);
                vista.setVisible(true);
            }
            else{
                System.out.println("Tipo de usuario no identificado");
                System.exit(1);
            }
        }
    }
    
}
