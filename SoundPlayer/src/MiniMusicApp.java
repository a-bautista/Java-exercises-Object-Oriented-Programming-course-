import javax.sound.midi.*;

public class MiniMusicApp {

    public void play(){
        try{
            /*
             1.Get a sequencer
             2.Make a sequence.
             3.Get a track.
             4.Fill the track with MidiEvents
             5. Play the sequencer. 
             
             */
            
            Sequencer player= MidiSystem.getSequencer();
            player.open();
            Sequence seq =  new Sequence(Sequence.PPQ,4);
            Track track = seq.createTrack();
            
            ShortMessage message = new ShortMessage();
            message.setMessage(144,1,96,100);
            //message type, channel, note to play, velocity
            //144 means note on and 128 means note off
            //note to play goes from 0 to 127
            
            MidiEvent eventOn = new MidiEvent(message,1);
            track.add(eventOn);
            
            ShortMessage message2 = new ShortMessage();
            message2.setMessage(128,1,67,100);
            MidiEvent eventOff = new MidiEvent(message2,1);
            //duration of the note MidiEvent(message2,1);
            track.add(eventOff);
            
            player.setSequence(seq);
            player.start();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
