package org.academiadecodigo.flepyku;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.net.URL;

public class Sound {
    URL dragonBall = getClass().getClassLoader().getResource("cell.wav");
    URL gameMenu = getClass().getClassLoader().getResource("opening.wav");
    private Clip clip1, clip2;

    public void playMusicGame(){
        try {
            clip1 = AudioSystem.getClip();
            clip1.open(AudioSystem.getAudioInputStream(dragonBall));
            clip1.loop(500);

        } catch (Exception e) {
        }
    }

    public void stopIntroMusic(){
        clip2.close();
    }

    public void playIntroMusic(){
        try {
            clip2 = AudioSystem.getClip();
            clip2.open(AudioSystem.getAudioInputStream(gameMenu));
            clip2.loop(500);

        } catch (Exception e) {
        }
    }

    public void  stopMusicGame(){
        clip1.close();
    }
}
