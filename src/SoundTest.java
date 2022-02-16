import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;


public class SoundTest {


        private File dragonBall = new File("C:/Users/xburn/Desktop/GitTest/flepiku/resources/cell.wav");

        public void playMusic(){
            try {
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(dragonBall));
                System.out.println("SOUND ON!!!");
                clip.start();

            } catch (Exception e) {
                System.out.println("Sound not played");
        }





        }
    }



