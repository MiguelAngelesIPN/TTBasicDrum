package Modelos;

import javax.sound.midi.MidiMessage;
import javax.sound.midi.Receiver;

public class Receptor implements Receiver{
    public void close(){
        
    }
    public void send(MidiMessage mensaje, long tiempo) {
        for(byte i = 0; i < mensaje.getLength(); i++) {
            System.out.print((int) (mensaje.getMessage()[i] & 0xFF) + ", ");
        }
        System.out.println();
    }
}