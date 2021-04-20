package Modelos;
public class Usuario {
    private Integer ID;
    private String nombre;
    private String contrasenia;
    private String tipo;
    private String estado;
    private String email;
    
    public Usuario(){
        this.ID=null;
        this.nombre=null;
        this.contrasenia=null;
        this.tipo=null;
        this.estado=null;
        this.email=null;
    }

    public Usuario(Integer ID, String nombre, String contrasenia, String tipo, String estado, String email) {
        this.ID = ID;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.tipo = tipo;
        this.estado = estado;
        this.email = email;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
