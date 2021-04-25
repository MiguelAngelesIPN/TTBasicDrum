package Servicios;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import javax.swing.JOptionPane;

public class ReproductorMidi {
    private String ubicacion;
    private Sequencer sequencer;
    private int tempo;
    public ReproductorMidi(){
        
    }
    public ReproductorMidi(String ubicacion){
        this.ubicacion=ubicacion;
        try{
            sequencer=MidiSystem.getSequencer();
            if(sequencer==null){
                JOptionPane.showMessageDialog(null, "No soportado");
            }
            else{
                sequencer.open();
            }
        }
        catch(Exception e){
            
        }
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    public void Reproducir(){
        
    }
}
