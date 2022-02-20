package org.academiadecodigo.flepyku;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controls implements KeyboardHandler {

    //properties
    private Keyboard keyboard;
    private int[] keys;
    private boolean gameStarted = true;
    private boolean outOfMenu = false;
    private GameMenu gameMenu;


    //constructor
    public Controls(){
        gameMenu = new GameMenu();
        gameMenu.init();

        keyboard = new Keyboard(this);

        //Array de Keys
        keys = new int[3];
        keys[0] = KeyboardEvent.KEY_SPACE;
        keys[1] = KeyboardEvent.KEY_S;
        keys[2] = KeyboardEvent.KEY_Q;

        for (int key = 0; key < keys.length; key++) {
            KeyboardEvent event = new KeyboardEvent();
            event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            event.setKey(keys[key]);

            keyboard.addEventListener(event);
        }
    }

    //methods

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_SPACE:
                if(outOfMenu){
                if(gameStarted){
                gameMenu.gameStart();
                gameStarted = false;
                }
                gameMenu.playerJump();
                }
                break;
            case KeyboardEvent.KEY_S:
                if(gameStarted){
                gameMenu.gameInit();
                outOfMenu = true;
                }
                break;
            case KeyboardEvent.KEY_Q:
                System.exit(0);
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


}
