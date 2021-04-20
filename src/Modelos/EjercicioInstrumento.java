package Modelos;
public class EjercicioInstrumento {
    private Integer idEjercicioInstrumento;
    private Integer idEjercicio;
    private Integer idInstrumento;

    public EjercicioInstrumento() {
        this.idEjercicioInstrumento = null;
        this.idEjercicio = null;
        this.idInstrumento = null;
    }

    public EjercicioInstrumento(Integer idEjercicioInstrumento, Integer idEjercicio, Integer idInstrumento) {
        this.idEjercicioInstrumento = idEjercicioInstrumento;
        this.idEjercicio = idEjercicio;
        this.idInstrumento = idInstrumento;
    }

    public Integer getIdEjercicioInstrumento() {
        return idEjercicioInstrumento;
    }

    public void setIdEjercicioInstrumento(Integer idEjercicioInstrumento) {
        this.idEjercicioInstrumento = idEjercicioInstrumento;
    }

    public Integer getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(Integer idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public Integer getIdInstrumento() {
        return idInstrumento;
    }

    public void setIdInstrumento(Integer idInstrumento) {
        this.idInstrumento = idInstrumento;
    }
    
}
