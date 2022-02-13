import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Piccolo {

    private int posX;
    private int posY;
    private Picture piccolo;
    private static int PICCOLO_HEIGHT = 63;
    private static int PADDING = 10;
    private Background background;
    private int direction;

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


    public void moveDown(){
                posY+=2;
                piccolo.translate(0,2);

        try {
                Thread.sleep(10);
            }
        catch (InterruptedException e) {
                System.out.println("deu merda");
            }
    }

    public void moveUp(){
            posY -= 2;
            piccolo.translate(0, -2);
        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e) {
            System.out.println("deu merda");
        }
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
}

