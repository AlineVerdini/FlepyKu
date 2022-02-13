public class Game {

    private Controls controls;
    private Player player;
    private boolean isStarted;
    private Background background;
    private Piccolo piccolo;

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

    }

    public void start(){
        this.init();
        isStarted = true;
        while (isStarted == true) {
            player.falling();
            piccolo.move();
        }
    }

    public void stop(){
        isStarted = false;
    }
}


