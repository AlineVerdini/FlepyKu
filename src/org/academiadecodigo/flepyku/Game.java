package org.academiadecodigo.flepyku;

import org.academiadecodigo.flepyku.piccolo.Piccolo;

import java.util.Timer;
import java.util.TimerTask;

public class Game {

    private Piccolo piccolo;
    private Background background;
    private Player player;
    private BarraStats barraStats;
    private GameOver gameOver;
    private GameWon gameWon;
    private CrystalBalls crystalBalls;
    private boolean gameLost;
    private boolean victory;




    public Game(){
        player = new Player();
        background = new Background();
        piccolo = new Piccolo();
        barraStats = new BarraStats(player);
        gameOver = new GameOver();
        crystalBalls = new CrystalBalls();
        gameWon = new GameWon();
    }

    public void init() {
        new Reminder(20);
        background.show();
        piccolo.show();
        player.show();
        barraStats.show();
    }

    public void start() {
        if(!victory || !gameLost) {
            player.falling();
            piccolo.move();
            piccolo.attack();
            crystalBalls.showBalls();
            damage();
            catchBalls();
            lifeStats();
            gameWin();
        }

    }

    private void lifeStats(){
        if(player.getLife() < 40 && player.getLife() >= 20){
            barraStats.loseBean1();
        }
        if (player.getLife() <= 20 && player.getLife() >= 10) {
            barraStats.loseBean2();
        }
        if (player.getLife() <= 0) {
            barraStats.loseBean3();
            gameLost = true;
            if(gameLost){
            gameOver();
            }
        }
    }

    private void gameWin(){
        if(barraStats.Won()){
            gameWon.wonGame();
            piccolo.delete();
            player.delete();
            barraStats.delete();
            background.delete();
            for (int i = 0; i < 7; i++) {
                crystalBalls.delete(i);
            }
            victory = true;
        }
    }

    private void gameOver(){
        if (!victory) {
            gameOver.endGame();
            piccolo.delete();
            player.delete();
            barraStats.delete();
            background.delete();
            for (int i = 0; i < 7; i++) {
                crystalBalls.delete(i);
            }
        }
    }

    public void jump(){
        player.jump();
    }

    public void catchBalls() {
        for (int i = 0; i < crystalBalls.getBallPictures().length; i++) {
            if (player.getPosX() + 166 >= crystalBalls.getPosX(i) && player.getPosX() + 166 <= crystalBalls.getPosX(i) + 100 && crystalBalls.getPosX(i) != 0) {
                if (crystalBalls.getPosY(i) + 50 >= player.getPosY() && crystalBalls.getPosY(i) <= player.getPosY() + Player.GOKU_HEIGHT && crystalBalls.getPosY(i) != 0) {
                    crystalBalls.setIsCaught(i);
                    if (crystalBalls.getIsCaught()[i]) {
                        if (crystalBalls.getIsCaught()[0]) {
                            barraStats.setBola1();
                            crystalBalls.delete(0);
                        }
                        if (crystalBalls.getIsCaught()[1]) {
                            barraStats.setBola2();
                            crystalBalls.delete(1);
                        }
                        if (crystalBalls.getIsCaught()[2]) {
                            barraStats.setBola3();
                            crystalBalls.delete(2);
                        }
                        if (crystalBalls.getIsCaught()[3]) {
                            barraStats.setBola4();
                            crystalBalls.delete(3);
                        }
                        if (crystalBalls.getIsCaught()[4]) {
                            barraStats.setBola5();
                            crystalBalls.delete(4);
                        }
                        if (crystalBalls.getIsCaught()[5]) {
                            barraStats.setBola6();
                            crystalBalls.delete(5);
                        }
                        if (crystalBalls.getIsCaught()[6]) {
                            barraStats.setBola7();
                            crystalBalls.delete(6);
                        }
                    }
                    }
                }
            }
        }

        public void damage () {

            for (int i = 0; i < piccolo.attackPosX().length; i++) {
                if (player.getPosX() + 166 >= piccolo.attackPosX()[i] && player.getPosX() + 166 <= piccolo.attackPosX()[i] + 80 && piccolo.attackPosX()[i] != 0) {
                    if (piccolo.attackPosY()[i] + 50 >= player.getPosY() && piccolo.attackPosY()[i] <= player.getPosY() + Player.GOKU_HEIGHT && piccolo.attackPosY()[i] != 0) {
                        piccolo.deletePiccoloAttacks(i);
                        player.hit();
                    }
                }
            }
        }

        public class Reminder {
            Timer timer;

            public Reminder(int timing) {
                timer = new Timer();
                timer.schedule(new RemindTask(), timing);
            }

            class RemindTask extends TimerTask {

                public void run() {
                        start();
                        new Reminder(20);
                        timer.cancel();
                }
            }

        }

    }

