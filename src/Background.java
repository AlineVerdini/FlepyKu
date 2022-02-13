import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Background {


    public static final int PADDING = 10;
    private Picture picture;


    public Background(){
        this.picture = new Picture(PADDING, PADDING, "BackGround1.png");
        picture.draw();
    }

    public int getWidth(){
        return picture.getWidth();
    }

    public int getHeight(){
        return picture.getHeight();
    }
}
