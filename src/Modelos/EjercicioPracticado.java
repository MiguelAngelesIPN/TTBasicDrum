package Modelos;

import java.sql.Date;

public class EjercicioPracticado {
    private Integer idEjercicioPracticado;
    private Date FechaPractica;
    private Float puntaje;
    private Integer velocidadPractica;
    private Integer idUsuario;
    private Integer idEjercicio;

    public EjercicioPracticado() {
        this.idEjercicioPracticado = null;
        this.FechaPractica = null;
        this.puntaje = null;
        this.velocidadPractica = null;
        this.idUsuario = null;
        this.idEjercicio = null;
    }

    public EjercicioPracticado(Integer idEjercicioPracticado, Date FechaPractica, Float puntaje, Integer velocidadPractica, Integer idUsuario, Integer idEjercicio) {
        this.idEjercicioPracticado = idEjercicioPracticado;
        this.FechaPractica = FechaPractica;
        this.puntaje = puntaje;
        this.velocidadPractica = velocidadPractica;
        this.idUsuario = idUsuario;
        this.idEjercicio = idEjercicio;
    }

    public Integer getIdEjercicioPracticado() {
        return idEjercicioPracticado;
    }

    public void setIdEjercicioPracticado(Integer idEjercicioPracticado) {
        this.idEjercicioPracticado = idEjercicioPracticado;
    }

    public Date getFechaPractica() {
        return FechaPractica;
    }

    public void setFechaPractica(Date FechaPractica) {
        this.FechaPractica = FechaPractica;
    }

    public Float getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Float puntaje) {
        this.puntaje = puntaje;
    }

    public Integer getVelocidadPractica() {
        return velocidadPractica;
    }

    public void setVelocidadPractica(Integer velocidadPractica) {
        this.velocidadPractica = velocidadPractica;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(Integer idEjercicio) {
        this.idEjercicio = idEjercicio;
    }
    
    
}
