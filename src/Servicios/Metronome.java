/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

/**
 *
 * @author Miguel Angeles
 */
public class Metronome implements MetaEventListener {
    private Sequencer sequencer;
    private int bpm;

    public void start(int bpm) {
        try {
            this.bpm = bpm;
            openSequencer();
            Sequence seq = createSequence();
            startSequence(seq);
        } catch (InvalidMidiDataException | MidiUnavailableException ex) {
            Logger.getLogger(Metronome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void restart(int bpm) {
        try {
            this.bpm = bpm;
            restartSequence();
        } catch (InvalidMidiDataException ex) {
            Logger.getLogger(Metronome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void stop() throws MidiUnavailableException, InvalidMidiDataException{
        stopSequencer();
        closeSequencer();
    }

    private void closeSequencer() throws MidiUnavailableException{
        sequencer.close();
    }
    
    private void stopSequencer() throws InvalidMidiDataException{
        sequencer.stop();
    }
    
    private void openSequencer() throws MidiUnavailableException {
        sequencer = MidiSystem.getSequencer();
        sequencer.open();
        sequencer.addMetaEventListener(this);
    }

    private Sequence createSequence() {
        try {
            Sequence seq = new Sequence(Sequence.PPQ, 1);
            Track track = seq.createTrack();

            ShortMessage msg = new ShortMessage(ShortMessage.PROGRAM_CHANGE, 9, 1, 0);
            MidiEvent evt = new MidiEvent(msg, 0);
            track.add(evt);

            addNoteEvent(track, 0);
            addNoteEvent(track, 1);
            addNoteEvent(track, 2);
            addNoteEvent(track, 3);

            msg = new ShortMessage(ShortMessage.PROGRAM_CHANGE, 9, 1, 0);
            evt = new MidiEvent(msg, 4);
            track.add(evt);
            return seq;
        } catch (InvalidMidiDataException ex) {
            Logger.getLogger(Metronome.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    private void addNoteEvent(Track track, long tick) throws InvalidMidiDataException {
        ShortMessage message = new ShortMessage(ShortMessage.NOTE_ON, 9, 37, 100);
        MidiEvent event = new MidiEvent(message, tick);
        track.add(event);
    }

    private void startSequence(Sequence seq) throws InvalidMidiDataException {
        sequencer.setSequence(seq);
        sequencer.setTempoInBPM(bpm);
        sequencer.start();
    }
    
    private void restartSequence() throws InvalidMidiDataException {
        sequencer.setTempoInBPM(bpm);
    }

    @Override
    public void meta(MetaMessage message) {
        if (message.getType() != 47) {  // 47 is end of track
            return;
        }
        doLoop();
    }

    private void doLoop() {
        if (sequencer == null || !sequencer.isOpen()) {
            return;
        }
        sequencer.setTickPosition(0);
        sequencer.start();
        sequencer.setTempoInBPM(bpm);
    }
}