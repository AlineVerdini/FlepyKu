package org.academiadecodigo.flepyku;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player {

    private int posX;


    private int posY;
    private Picture gokuPic;
    public static final int GOKU_HEIGHT = 65;
    private int life = 50;

    public Player(){
        posX = GameMenu.PADDING;
        posY = 200 - GameMenu.PADDING;
        gokuPic = new Picture(posX,posY,"Goku.png");
    }

    public void show(){
        gokuPic.draw();
    }

    public void delete(){
        gokuPic.delete();
    }

    public void falling(){
        if (posY + GOKU_HEIGHT <= Background.HEIGHT) {
            posY+=2;
            gokuPic.translate(0,2);
        }
    }
    public void jump() {
        if(posY >= GOKU_HEIGHT){
        posY -= GOKU_HEIGHT;
        gokuPic.translate(0, -GOKU_HEIGHT);
        }
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getLife(){
        return life;
    }

    public void hit(){
        life--;
    }
}
