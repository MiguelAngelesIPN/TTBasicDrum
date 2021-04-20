package Modelos;
public class Ejercicio {
    private Integer idEjercicio;
    private String nombre;
    private String ubicacion;
    private Integer idTema;

    public Ejercicio() {
        this.idEjercicio=null;
        this.nombre=null;
        this.ubicacion=null;
        this.idTema=null;
    }

    public Ejercicio(Integer idEjercicio, String nombre, String ubicacion, Integer idTema) {
        this.idEjercicio = idEjercicio;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.idTema = idTema;
    }

    public Integer getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(Integer idEjercicio) {
        this.idEjercicio = idEjercicio;
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
