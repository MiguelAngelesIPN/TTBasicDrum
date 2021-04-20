package Modelos;
public class Recurso {
    private Integer idRecurso;
    private String tipo;
    private String nombre;
    private String ubicacion;
    private Integer idTema;

    public Recurso() {
        this.idRecurso = null;
        this.tipo = null;
        this.nombre = null;
        this.ubicacion = null;
        this.idTema = null;
    }

    public Recurso(Integer idRecurso, String tipo, String nombre, String ubicacion, Integer idTema) {
        this.idRecurso = idRecurso;
        this.tipo = tipo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.idTema = idTema;
    }

    public Integer getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(Integer idRecurso) {
        this.idRecurso = idRecurso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getIdTema() {
        return idTema;
    }

    public void setIdTema(Integer idTema) {
        this.idTema = idTema;
    }
    
    
}
