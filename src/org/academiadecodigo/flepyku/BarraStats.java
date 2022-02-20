package org.academiadecodigo.flepyku;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class BarraStats {


    private Rectangle rectangle;
    private Color color = Color.LIGHT_GRAY;
    private Player player;
    private Picture feijão1;
    private Picture feijão2;
    private Picture feijão3;
    private Picture ball4;
    private Text ballCounter;
    private boolean win;


    public BarraStats(Player player) {
        this.player = player;
        rectangle = new Rectangle(10, Background.HEIGHT + 20, Background.WIDTH, 45);
        feijão1 = new Picture(20, Background.HEIGHT + 25, "beanBorder.png");
        feijão2 = new Picture(60, Background.HEIGHT + 25, "beanBorder.png");
        feijão3 = new Picture(100, Background.HEIGHT + 25, "beanBorder.png");
        ball4 = new Picture(Background.WIDTH - 50, Background.HEIGHT + 20, "Untitled_Artwork 4.png");
        ballCounter = new Text(Background.WIDTH - 80, Background.HEIGHT + 36, 0 + " : ");
    }

    public void show() {
        rectangle.draw();
        rectangle.fill();
        rectangle.setColor(color);
        feijão1.draw();
        feijão2.draw();
        feijão3.draw();
        ball4.draw();
        ballCounter.draw();
        ballCounter.grow(10,10);
    }

    public void delete(){
        rectangle.delete();
        ballCounter.delete();
        ball4.delete();
    }

    public void loseBean1() {
        feijão3.delete();
    }

    public void loseBean2() {
        feijão2.delete();
    }

    public void loseBean3() {
        feijão1.delete();
    }

    public void setBola1() {
        ballCounter.delete();
        ballCounter = new Text(Background.WIDTH - 80, Background.HEIGHT + 36, 1 + " : ");
        ballCounter.draw();
        ballCounter.grow(10,10);
    }
    public void setBola2() {
        ballCounter.delete();
        ballCounter = new Text(Background.WIDTH - 80, Background.HEIGHT + 36, 2 + " : ");
        ballCounter.draw();
        ballCounter.grow(10,10);
    }
    public void setBola3() {
        ballCounter.delete();
        ballCounter = new Text(Background.WIDTH - 80, Background.HEIGHT + 36, 3 + " : ");
        ballCounter.draw();
        ballCounter.grow(10,10);
    }
    public void setBola4() {
        ballCounter.delete();
        ballCounter = new Text(Background.WIDTH - 80, Background.HEIGHT + 36, 4 + " : ");
        ballCounter.draw();
        ballCounter.grow(10,10);
    }
    public void setBola5() {
        ballCounter.delete();
        ballCounter = new Text(Background.WIDTH - 80, Background.HEIGHT + 36, 5 + " : ");
        ballCounter.draw();
        ballCounter.grow(10,10);
    }
    public void setBola6() {
        ballCounter.delete();
        ballCounter = new Text(Background.WIDTH - 80, Background.HEIGHT + 36, 6 + " : ");
        ballCounter.draw();
        ballCounter.grow(10,10);
    }
    public void setBola7() {
        ballCounter.delete();
        ballCounter = new Text(Background.WIDTH - 80, Background.HEIGHT + 36, 7 + " : ");
        ballCounter.draw();
        ballCounter.grow(10,10);
        win = true;
    }

    public boolean Won() {
        return win;
    }
}
