package Modelos;

import java.util.ArrayList;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.*;
import javax.swing.JOptionPane;

public class InstrumentoMidi {
    private MidiDevice midiDevice;
    private ArrayList<String> informacion;
    private Object[] informaciones;
    private MidiDevice instrumento;
    private Transmitter transmisor1,transmisor2;
    private Receiver receptor1,receptor2;
    private Sequencer secuenciador;
    private int tempo;
    
    public InstrumentoMidi(int tempo) throws MidiUnavailableException{
        this.tempo=tempo;
        informacion=new ArrayList<>();
        MidiDevice.Info[] info=MidiSystem.getMidiDeviceInfo();
        for (MidiDevice.Info info1 : info) {
            midiDevice = MidiSystem.getMidiDevice(info1);
            if(midiDevice.getMaxTransmitters()!=0 && midiDevice.getMaxReceivers()==0){
                informacion.add(midiDevice.getDeviceInfo().getName());
            }
        }
        informaciones=informacion.toArray();
        if(informaciones.length==0){
            JOptionPane.showMessageDialog(null,"No hay instrumentos conectados");
        }
        else{
            String definitivo=(String) JOptionPane.showInputDialog(null, "Selecciona un instrumento","Elige",JOptionPane.QUESTION_MESSAGE,null,informaciones,informaciones[0]);
            for(MidiDevice.Info info2 : info){
                if(definitivo.equals(info2.getName())){
                    instrumento=MidiSystem.getMidiDevice(info2);
                    break;
                }
            }
            System.out.println("Instrumento seleccionado: "+instrumento.getDeviceInfo().getName());
        }
    }
    
    public void IniciarInstrumento() throws MidiUnavailableException{
        instrumento.open();
        secuenciador=MidiSystem.getSequencer();
        transmisor1=instrumento.getTransmitter();
        receptor1=new Receptor();
        transmisor1.setReceiver(receptor1);
        transmisor2=instrumento.getTransmitter();
        receptor2=secuenciador.getReceiver();
        transmisor2.setReceiver(receptor2);
    }
    public void DetenerInstrumento(){
        instrumento.close();
        
    }
}