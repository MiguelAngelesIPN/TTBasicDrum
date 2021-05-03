package Servicios;

import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.swing.JOptionPane;

public class ReproductorMidi {
    private String ubicacion;
    private Sequencer sequencer;
    private int tempo;
    private Sequence sequence;
    public ReproductorMidi(){
        
    }
    public ReproductorMidi(String ubicacion,int tempo) throws InvalidMidiDataException, IOException{
        this.ubicacion=ubicacion;
        this.tempo=tempo;
        try{
            sequencer=MidiSystem.getSequencer();
            if(sequencer==null){
                JOptionPane.showMessageDialog(null, "No soportado");
            }
            else{
                sequencer.open();
                File archivo=new File(ubicacion);
                sequence=MidiSystem.getSequence(archivo);
                sequencer.setSequence(sequence);
                sequencer.setTempoInBPM(tempo);
            }
        }
        catch(HeadlessException | MidiUnavailableException e){
            
        }
    }
    
    public void Cerrar(){
        sequencer.close();
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
        sequencer.setTempoInBPM(tempo);
    }
    
    public void Reproducir(){
        sequencer.start();
    }
}
