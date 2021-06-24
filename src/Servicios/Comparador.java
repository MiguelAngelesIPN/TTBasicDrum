package Servicios;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.sound.midi.*;
import static javax.sound.midi.ShortMessage.NOTE_ON;

public class Comparador {
    private String midi1,midi2;
    private ArrayList<DatosMidi> mensajes1,mensajes2;
    private int Aciertos=0,total;
    public Comparador(String midi1,String midi2){
        this.midi1=midi1;
        this.midi2=midi2;
        System.out.println(midi2);
    }
    public void ObtenerDatos() throws InvalidMidiDataException, IOException{
        Sequence archivo1=MidiSystem.getSequence(new File(midi1));
        Sequence archivo2=MidiSystem.getSequence(new File(midi2));
        Track[] trackArchivo1=archivo1.getTracks();
        Track[] trackArchivo2=archivo2.getTracks();
        System.out.println(trackArchivo2.length);
        Track track1=trackArchivo1[0];
        Track track2=trackArchivo2[0];
        mensajes1=new ArrayList<>();
        mensajes2=new ArrayList<>();
        Comparacion(track1,mensajes1);
        Comparacion(track2,mensajes2);
        total=mensajes2.size();
        ImprimeArrays();
        Comparar();
    }
    private void Comparacion(Track track,ArrayList mensajes){
        for(int i=0;i<track.size();i++){
            MidiEvent event=track.get(i);
            MidiMessage mensaje=event.getMessage();
            if(mensaje instanceof ShortMessage){
                ShortMessage sm=(ShortMessage)mensaje;
                if(sm.getCommand()==NOTE_ON&&sm.getData2()!=0){
                    int key=sm.getData1();
                    int velocidad=sm.getData2();
                    DatosMidi datos=new DatosMidi(event.getTick(),sm.getChannel(),sm.getData1(),sm.getData2());
                    mensajes.add(datos);
                    //System.out.println("@"+event.getTick()+" Channel: "+sm.getChannel()+" Note on: key: "+key+" velocidad: "+velocidad);
                }
            }
        }
    }
    private void Comparar(){
        mensajes1.forEach((mensajes11) -> {
            mensajes2.stream().filter((mensajes21) -> (mensajes11.getTick()>(mensajes21.getTick()-200)&&mensajes11.getTick()<(mensajes21.getTick()+200))&&mensajes11.getNota()==mensajes21.getNota()).forEachOrdered((_item) -> {
                Aciertos=Aciertos+1;
                //break;
            });
        });
        System.out.println("Aciertos: "+Aciertos);
    }
    private void ImprimeArrays(){
        System.out.println("Array1. Tamaño: "+mensajes1.size());
        for(int i=0;i<mensajes1.size();i++){
            System.out.print(mensajes1.get(i).getTick()+"\t");
        }
        System.out.println("");
        System.out.println("Array2. Tamaño: "+mensajes2.size());
        for(int i=0;i<mensajes2.size();i++){
            System.out.print(mensajes2.get(i).getTick()+"\t");
        }
        System.out.println();
    }
    public int AsignarNota(){
        int puntaje;
        puntaje=(Aciertos*10)/total;
        System.out.println("Puntaje: "+puntaje);
        return puntaje;
    }
}
