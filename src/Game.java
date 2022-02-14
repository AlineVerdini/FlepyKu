public class Game {

    private Controls controls;
    private Player player;
    private boolean isStarted;
    private Background background;
    private Piccolo piccolo;
    private PiccoloAttack piccoloAttack;

    //constructor

    //Methods

    public void init(){
        background = new Background();
        player = new Player();
        player.show();
        piccolo = new Piccolo(background);
        piccolo.show();
        controls = new Controls(player);
        controls.init();
        piccoloAttack = new PiccoloAttack(background);
        piccoloAttack.show();

    }

    public void start(){
        this.init();
        isStarted = true;
        while (isStarted == true) {
            player.falling();
            piccolo.move();
            piccoloAttack.moveLeft();
        }
    }

    public void stop(){
        isStarted = false;
    }
}


