package org.academiadecodigo.flepyku;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameOver {

    private Picture gameOverPic;

    public GameOver() {
        this.gameOverPic = new Picture(GameMenu.PADDING, GameMenu.PADDING,"GameOver.png");
    }

    public void endGame() {
        gameOverPic.draw();
    }

}
