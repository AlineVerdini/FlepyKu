package org.academiadecodigo.flepyku;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CrystalBalls {


    private String[] ballNumberPic = new String[7];
    private Picture[] ballPictures = new Picture[7];
    private boolean[] isActive = new boolean[7];
    private int[] posX = new int[7];
    private int[] posY = new int[7];
    private boolean[] isCaught = new boolean[7];
    private int counter = 0;
    private int timer;


    public CrystalBalls() {

        ballNumberPic[0] = "Untitled_Artwork 1.png";
        ballNumberPic[1] = "Untitled_Artwork 2.png";
        ballNumberPic[2] = "Untitled_Artwork 3.png";
        ballNumberPic[3] = "Untitled_Artwork 5.png";
        ballNumberPic[4] = "Untitled_Artwork 4.png";
        ballNumberPic[5] = "Untitled_Artwork 6.png";
        ballNumberPic[6] = "Untitled_Artwork 7.png";

        for (int i = 0; i < ballNumberPic.length; i++) {
            posX[i]=1014 - 50;
            posY[i]=randomY();
            ballPictures[i] = new Picture(posX[i], posY[i], ballNumberPic[i]);
        }

    }

    private int randomY(){
        return GameMenu.PADDING + (int) (Math.random() * ((371 - GameMenu.PADDING) + 1 ));
    }


    public void showBalls() {
        for(int i = 0; i < ballPictures.length; i++){
            if(getIsActive(i)){
                moveLeft(i);
                timer++;
            }
        }
        if (timer % 600 == 0  && ballPictures[counter] != null){
            ballPictures[counter].draw();
            isActive[counter] = true;
            if (counter < 6){
            counter++;
            }
        }
    }

    private boolean getIsActive(int positionArr){
        return isActive[positionArr];
    }

    public void delete(int positionArr) {
        ballPictures[positionArr].delete();
    }

    private void moveLeft(int positionArr){
        posX[positionArr] -= 5;
        ballPictures[positionArr].translate(-5, 0);
    }

    public int getPosX(int positionArr){
        return posX[positionArr];
    }

    public int getPosY(int positionArr){
        return posY[positionArr];
    }

    public Picture[] getBallPictures(){                             /// GET BALL PICTURES
        return ballPictures;
    }

    public void setIsCaught(int positionARR){
        isCaught[positionARR] = true;
    }

    public boolean[] getIsCaught() {
        return isCaught;
    }
}


