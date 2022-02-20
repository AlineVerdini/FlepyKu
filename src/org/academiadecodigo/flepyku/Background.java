package org.academiadecodigo.flepyku;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Background {

    public static int HEIGHT;
    public static int WIDTH;

    private Picture picture;


    public Background(){
        this.picture = new Picture(GameMenu.PADDING, GameMenu.PADDING, "BackGround1.png");
        HEIGHT = picture.getHeight();
        WIDTH = picture.getWidth();
    }

    public void show(){
        picture.draw();
    }

    public void delete(){
        picture.delete();
    }

}
