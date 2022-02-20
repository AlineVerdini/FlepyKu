package org.academiadecodigo.flepyku;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameWon {

    private Picture gameWonPic;

    public GameWon() {
        this.gameWonPic = new Picture(GameMenu.PADDING, GameMenu.PADDING,"youWon.png");
    }

    public void wonGame() {
        gameWonPic.draw();
    }

}
