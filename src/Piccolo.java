import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Piccolo {

    private int posX;
    private int posY;
    private Picture piccolo;
    private static int PICCOLO_HEIGHT = 63;
    private static int PADDING = 10;
    private Background background;
    private int direction;


    private int life = 3;

        //x --> horizontal
        //y --> vertical

    public Piccolo(Background background){
        this.background = background;
        posX = background.getWidth() - 100;
        posY = 200 - PADDING;
        piccolo = new Picture(posX,posY, "Piccolo2.png");
    }

    public void show(){
            piccolo.draw();
        }


    public void moveDown() {
        posY += 2;
        piccolo.translate(0, 2);

    }

    public void moveUp(){
            posY -= 2;
            piccolo.translate(0, -2);

    }

    public void move(){
        if(direction == 0){
            moveUp();
            if (posY <= PADDING){
                direction = 1;
                move();
            }
        }
        if(direction == 1){
        moveDown();
            if(posY + piccolo.getHeight() >= background.getHeight()){
            direction = 0;
            move();
            }
        }
    }

    public int getPosY() {
            return posY;
        }

    public int getLife() {
        return life;
    }

}

