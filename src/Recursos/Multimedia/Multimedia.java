
package Recursos.Multimedia;
public class Multimedia {
    private String nombre;
    private String ubicacion;
    private String tipo;

    public Multimedia() {
        this.nombre=null;
        this.ubicacion=null;
        this.tipo=null;
    }

    public Multimedia(String nombre, String ubicacion,String tipo) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tipo=tipo;
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
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
