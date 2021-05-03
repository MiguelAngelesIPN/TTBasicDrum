package Servicios;

import java.util.ArrayList;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;

public class InstrumentoMidi {
    private MidiDevice midiDevice;
    private ArrayList<MidiDevice> instrumentos;
    
    public InstrumentoMidi(){
        instrumentos=new ArrayList<>();
        MidiDevice.Info[] info=MidiSystem.getMidiDeviceInfo();
        for(int i=0;i<info.length;i++){
            try{
                midiDevice=MidiSystem.getMidiDevice(info[i]);
                System.out.println(info[i]);
                instrumentos.add(midiDevice);
            }
            catch(Exception e){
                
            }
        }
    }
}
