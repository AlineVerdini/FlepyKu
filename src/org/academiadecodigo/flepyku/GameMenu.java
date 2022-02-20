package org.academiadecodigo.flepyku;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameMenu {

    //Properties
    public static final int PADDING = 10;

    private Picture menuStartPic;
    private Picture flapykuLogoPic;
    private Picture controlsPic;
    private Game game;
    private Sound sound;


    //Constructor

    public GameMenu(){
        menuStartPic = new Picture(PADDING,PADDING, "MenuStart.png");
        flapykuLogoPic = new Picture(350,110, "FlepyKU.png");
        controlsPic = new Picture(550,260,"menu.png");
        sound = new Sound();
        game = new Game();

    }

    public void init(){
        menuStartPic.draw();
        flapykuLogoPic.draw();
        controlsPic.draw();
        sound.playIntroMusic();
    }

    public void endGameMenu(){
        menuStartPic.delete();
        flapykuLogoPic.delete();
        controlsPic.delete();
        sound.stopIntroMusic();
    }

    public void gameInit(){
        endGameMenu();
        game.init();
        sound.playMusicGame();
    }

    public void gameStart(){
        game.start();
    }

    public void playerJump(){
        game.jump();
    }


}
