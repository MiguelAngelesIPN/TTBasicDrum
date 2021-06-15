package Servicios;
public class DatosMidi {
    private long tick;
    private int channel;
    private int nota;
    private int volumen;

    public DatosMidi(long tick, int channel, int nota, int volumen) {
        this.tick = tick;
        this.channel = channel;
        this.nota = nota;
        this.volumen = volumen;
    }

    public long getTick() {
        return tick;
    }

    public void setTick(long tick) {
        this.tick = tick;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
}
