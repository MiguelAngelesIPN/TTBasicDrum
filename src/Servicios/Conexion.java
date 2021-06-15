package Servicios;

import Modelos.Usuario;
import Recursos.Multimedia.Multimedia;
import java.sql.*;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Conexion {
    private Connection conexion=null;
    public Conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/basicdrum?useSSL=false","basicDrum","basicdrum");
            if(conexion!=null){
                System.out.println("La conexion se realizo de manera exitosa");
            }
            else{
                System.out.println("La conexion ha fallado");
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(Arrays.toString(e.getStackTrace())+"\n"+e.getMessage());
        }
    }
    
    public Usuario UsuarioConectado() throws SQLException{
        Usuario usuario=new Usuario();
        String verificarConexion="select * from usuario where estado='activo'";
        PreparedStatement busqueda=conexion.prepareStatement(verificarConexion);
        ResultSet resultado=busqueda.executeQuery();
        if(resultado.next()){
            usuario.setID((Integer)resultado.getInt("Id"));
            usuario.setNombre((String)resultado.getString("Nombre"));
            usuario.setContrasenia((String)resultado.getString("Contraseña"));
            usuario.setTipo((String)resultado.getString("Tipo"));
            usuario.setEstado((String)resultado.getString("Estado"));
            usuario.setEmail((String)resultado.getString("Email"));
        }
        return usuario;
    }
    
    public void Actualizar(String comando) throws SQLException{
        PreparedStatement actualizacion=conexion.prepareStatement(comando);
        actualizacion.executeUpdate();
        System.out.println("Actualizacion realizada correctamente");
    }
    
    public ResultSet Consultar(String comando) throws SQLException{
        PreparedStatement busqueda=conexion.prepareStatement(comando);
        ResultSet resultado=busqueda.executeQuery();
        System.out.println("Busqueda realizada correctamente");
        return resultado;
    }
    
    public void Insertar(String comando) throws SQLException{
        PreparedStatement insertar=conexion.prepareStatement(comando);
        insertar.execute();
        System.out.println("Datos insertados correctamente");
    }
}
