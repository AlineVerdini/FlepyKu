import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class BarraStats {

    private Rectangle rectangle;
    private Color color = Color.LIGHT_GRAY;
    private Player player;
    private Background background;
    private Picture feijão1;
    private Picture feijão2;
    private Picture feijão3;


    public BarraStats(Player player,Background background){
        this.background = background;
        this.player = player;
        rectangle = new Rectangle(10,background.getHeight() + 20,background.getWidth(), 45);
        feijão1 = new Picture(20,background.getHeight() + 25, "beanBorder.png");
        feijão2 = new Picture(60,background.getHeight() + 25,  "beanBorder.png");
        feijão3 = new Picture(100,background.getHeight() + 25, "beanBorder.png");
        rectangle.draw();
        rectangle.fill();
        rectangle.setColor(color);
        feijão1.draw();
        feijão2.draw();
        feijão3.draw();
    }

    public void loseLife(){
        feijão3.delete();
    }
}
