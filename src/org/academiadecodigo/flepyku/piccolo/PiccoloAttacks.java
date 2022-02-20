package org.academiadecodigo.flepyku.piccolo;

import org.academiadecodigo.flepyku.Background;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class PiccoloAttacks {


    private int posX;
    private int posY;
    private boolean isActive;
    private Picture piccoloAttack;
    private Piccolo piccolo;

    public PiccoloAttacks(Piccolo piccolo) {
        this.piccolo = piccolo;
        posX = Background.WIDTH - 145;

    }


    public void showAttack() {
        posY = piccolo.getPosY() + 20;
        piccoloAttack = new Picture(posX, posY, "attackVegeta.png");
        piccoloAttack.draw();
        isActive = true;
    }

    public void delete(){
        if (piccoloAttack != null) {
        piccoloAttack.delete();
        }
    }

    public void moveLeft(){
        posX -= 5;
        piccoloAttack.translate(-5, 0);
    }

    public int getPosX() {
        return posX;
    }

    public boolean getActive(){
       return isActive;
    }

    public int getPosY() {
        return posY;
    }
}
