import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player {

        private int posX;
        private int posY;
        private Picture goku;
        private static int GOKU_HEIGHT = 63;
        private static int PADDING = 10;

        //x --> horizontal
        //y --> vertical

        public Player(){
            posX = 10;
            posY = 200 - PADDING;
            goku = new Picture(posX,posY, "Goku.png");
        }

        public void show(){
            goku.draw();
        }

        public void falling(){
            if (posY + GOKU_HEIGHT <= 400 + PADDING) {
                posY+=2;
                goku.translate(0,2);
                System.out.println("falling");
            }
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                System.out.println("deu merda");
            }

        }

        public void jump(){
            posY -= GOKU_HEIGHT;
            goku.translate(0,-GOKU_HEIGHT);
        }

        public int getPosY() {
            return posY;
        }

}