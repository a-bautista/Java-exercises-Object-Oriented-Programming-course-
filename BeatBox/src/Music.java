
import javax.sound.midi.*;

public class Music {

    
    public void play(){
     try{
        Sequencer sequencer = MidiSystem.getSequencer();
        System.out.println("We've got a sequencer.");
       }catch(MidiUnavailableException error){
           System.out.println("Explode");
       }
     }


    public static void main(String args[]){
        Music test= new Music();
        test.play();
    }
}
