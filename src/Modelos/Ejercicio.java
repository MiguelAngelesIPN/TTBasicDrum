package Modelos;
public class Ejercicio {
    private Integer idEjercicio;
    private String nombre;
    private String ubicacion;
    private Integer idTema;
    private String pentagrama;

    public Ejercicio() {
        this.idEjercicio=null;
        this.nombre=null;
        this.ubicacion=null;
        this.idTema=null;
        this.pentagrama=null;
    }

    public Ejercicio(Integer idEjercicio, String nombre, String ubicacion, Integer idTema, String pentagrama) {
        this.idEjercicio = idEjercicio;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.idTema = idTema;
        this.pentagrama=pentagrama;
    }

    public String getPentagrama() {
        return pentagrama;
    }

    public void setPentagrama(String pentagrama) {
        this.pentagrama = pentagrama;
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
