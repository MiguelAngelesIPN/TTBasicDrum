package Modelos;
public class Tema {
    private Integer idTema;
    private String nombre;
    private String descripcion;

    public Tema() {
        this.idTema = null;
        this.nombre = null;
        this.descripcion = null;
    }

    public Tema(Integer idTema, String nombre, String descripcion) {
        this.idTema = idTema;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getIdTema() {
        return idTema;
    }

    public void setIdTema(Integer idTema) {
        this.idTema = idTema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
