package Servicios;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.sound.midi.*;
import javax.swing.JOptionPane;
public class InstrumentoMidi{
    private MidiDevice midiDevice;
    private ArrayList<String> instrumentos;
    private MidiDevice seleccionado;
    private Object[] instrumento;
    private MidiDevice.Info[] info;
    private Transmitter transmisor1;
    private Receiver receptor1;
    private Sequencer secuenciador;
    private int tiempo;
    private Sequence secuencia;
    private Track pista;
    private File archivoMidi;
    
    public InstrumentoMidi() throws MidiUnavailableException{
        instrumentos=new ArrayList<>();
        info=MidiSystem.getMidiDeviceInfo();
        for(MidiDevice.Info info1:info){
            midiDevice=MidiSystem.getMidiDevice(info1);
            if(midiDevice.getMaxTransmitters()!=0&&midiDevice.getMaxReceivers()==0){
                System.out.println(midiDevice.getDeviceInfo().getName());
                instrumentos.add(info1.getName());
            }
        }
        seleccionado=null;
    }
    public int CantidadInstrumentos(){
        return instrumentos.size();
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    public void SeleccionarInstrumento() throws MidiUnavailableException{
        instrumento=instrumentos.toArray();
        String definitivo=(String) JOptionPane.showInputDialog(null, "Selecciona un instrumento","Elige",JOptionPane.QUESTION_MESSAGE,null,instrumento,instrumento[0]);
        for(MidiDevice.Info info1:info){
            if(definitivo.equals(info1.getName())){
                seleccionado=MidiSystem.getMidiDevice(info1);
                break;
            }
        }
        System.out.println(seleccionado.getDeviceInfo().getName());
    }
    public String InstrumentoSeleccionado(){
        return seleccionado.getDeviceInfo().getName();
    }
    public void IniciarInstrumento() throws MidiUnavailableException{
        seleccionado.open();
        secuenciador=MidiSystem.getSequencer();
        secuenciador.open();
        secuenciador.setTempoInBPM(tiempo);
        transmisor1=MidiSystem.getTransmitter();
        receptor1=secuenciador.getReceiver();
        transmisor1.setReceiver(receptor1);
    }
    public void IniciarGrabacion() throws InvalidMidiDataException{
        secuencia=new Sequence(Sequence.PPQ,960);
        pista=secuencia.createTrack();
        secuenciador.setSequence(secuencia);
        secuenciador.recordEnable(pista, -1);
        secuenciador.startRecording();
    }
    public void DetenerGrabacion() throws IOException{
        if(secuenciador.isRecording()){
            secuenciador.stopRecording();
            Sequence archivo=secuenciador.getSequence();
            Files.deleteIfExists(Paths.get("archivo.mid"));
            archivoMidi=new File("archivo.mid");
            MidiSystem.write(archivo, 0, archivoMidi);
            
        }
    }
    public void Cerrar(){
        seleccionado.close();
        secuenciador.close();
    }
    public File DevolverArchivo(){
        return archivoMidi;
    }
    
}
