import org.academiadecodigo.simplegraphics.pictures.Picture;

public class PiccoloAttack {

    private int posX;
    private int posY;
    private Picture piccoloAttack;
    private static int PICCOLO_HEIGHT = 58;
    private static int PADDING = 10;
    private Background background;
    private int direction;
    private Piccolo piccolo;

    //x --> horizontal
    //y --> vertical

    public PiccoloAttack(Background background){
        this.background = background;
        posX = background.getWidth() - 145;
        posY = 200 - PADDING;
        piccoloAttack = new Picture(posX,posY, "Piccolo_Attack.png");
    }

    public void show(){
        piccoloAttack.draw();
    }

    public void delete(){
        piccoloAttack.delete();
    }


    public void moveDown(){
        posY+=2;
        piccoloAttack.translate(0,2);


    }

    public void moveLeft(){
        posX -= 5;
        piccoloAttack.translate(-5, 0);

    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}

