package Modelos;
public class TemaInstrumento {
    private Integer idTemaInstrumento;
    private Integer idInstrumento;
    private Integer idTema;

    public TemaInstrumento() {
    }

    public TemaInstrumento(Integer idTemaInstrumento, Integer idInstrumento, Integer idTema) {
        this.idTemaInstrumento = idTemaInstrumento;
        this.idInstrumento = idInstrumento;
        this.idTema = idTema;
    }

    public Integer getIdTemaInstrumento() {
        return idTemaInstrumento;
    }

    public void setIdTemaInstrumento(Integer idTemaInstrumento) {
        this.idTemaInstrumento = idTemaInstrumento;
    }

    public Integer getIdInstrumento() {
        return idInstrumento;
    }

    public void setIdInstrumento(Integer idInstrumento) {
        this.idInstrumento = idInstrumento;
    }

    public Integer getIdTema() {
        return idTema;
    }

    public void setIdTema(Integer idTema) {
        this.idTema = idTema;
    }
    
}
