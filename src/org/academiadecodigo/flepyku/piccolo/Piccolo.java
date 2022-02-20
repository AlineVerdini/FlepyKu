package org.academiadecodigo.flepyku.piccolo;

import org.academiadecodigo.flepyku.Background;

import org.academiadecodigo.flepyku.GameMenu;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.Arrays;



public class Piccolo {

    //properties

    private int posX;
    private int posY;
    private Picture piccolo;
    private PiccoloAttacks[] piccoloAttacks;
    private int[] arrAttacksPosX;
    private int[] arrAttacksPosY;
    public int counter;
    private int direction = 0;

    //x --> horizontal
    //y --> vertical


    //contructor
    public Piccolo(){
        posX = Background.WIDTH - 100;
        posY = 200 - GameMenu.PADDING;
        piccolo = new Picture(posX,posY, "vegeta.png");
        piccoloAttacks = new PiccoloAttacks[2000];
        arrAttacksPosX = new int[piccoloAttacks.length];
        arrAttacksPosY = new int[piccoloAttacks.length];
        for (int i = 0; i < piccoloAttacks.length; i++) {
            piccoloAttacks[i] = new PiccoloAttacks(this);
        }
        counter = 0;
    }


    //methods
    public void show(){
        piccolo.draw();
    }

    public void delete() {
        piccolo.delete();
        for (int i = 0; i < piccoloAttacks.length; i++) {
            if (piccoloAttacks[i] != null){
            piccoloAttacks[i].delete();
                try {
                    piccoloAttacks[i].wait(200000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    private void moveDown() {
        posY += 2;
        piccolo.translate(0, 2);

    }

    private void moveUp(){
        posY -= 2;
        piccolo.translate(0, -2);

    }

    public int[] attackPosX(){
        for (int i = 0; i < piccoloAttacks.length; i++) {
            if (piccoloAttacks[i].getActive() || piccoloAttacks[i] != null ) {
                arrAttacksPosX[i] = piccoloAttacks[i].getPosX();
            }
        }
            return arrAttacksPosX;
    }

    public int[] attackPosY(){
        for (int i = 0; i < piccoloAttacks.length; i++) {
            if (piccoloAttacks[i].getActive() || piccoloAttacks[i] != null ) {
                arrAttacksPosY[i] = piccoloAttacks[i].getPosY();
            }
        }
        return arrAttacksPosY;
    }

    public void attack() {

        for (int i = 0; i < piccoloAttacks.length; i++) {
            if (piccoloAttacks[i].getActive()) {
                piccoloAttacks[i].moveLeft();
            }
        }
       if ((int) (Math.random() * 40) == 4 && counter >= 0) {
            piccoloAttacks[counter].showAttack();
            counter++;
       }

    }

    public void move() {
        if (direction == 0) {
            moveUp();
            if (posY <= GameMenu.PADDING) {
                direction = 1;
                move();
            }
        }
        if (direction == 1) {
            moveDown();
            if (posY + piccolo.getHeight() >= Background.HEIGHT) {
                direction = 0;
                move();
            }
        }
    }

    public int getPosY() {
        return posY;
    }

    public void deletePiccoloAttacks(int pos){

        piccoloAttacks[pos].delete();
    }
}
