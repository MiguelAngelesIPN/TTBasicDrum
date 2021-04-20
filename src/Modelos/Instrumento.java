package Modelos;
public class Instrumento {
    private Integer idInstrumento;
    private String tipo;
    private String descripcion;
    private String nombre;

    public Instrumento() {
        this.idInstrumento = null;
        this.tipo = null;
        this.descripcion = null;
        this.nombre = null;
    }

    public Instrumento(Integer idInstrumento, String tipo, String descripcion, String nombre) {
        this.idInstrumento = idInstrumento;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public Integer getIdInstrumento() {
        return idInstrumento;
    }

    public void setIdInstrumento(Integer idInstrumento) {
        this.idInstrumento = idInstrumento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
