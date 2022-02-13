public class Game {

    private Controls controls;
    private Player player;
    private boolean isStarted;
    private Background picture;

    //constructor

    //Methods

    public void init(){
        player = new Player();
        player.show();
        controls = new Controls(player);
        controls.init();
        picture = new Background("BackGround.png");

    }

    public void start(){
        this.init();
        isStarted = true;
        while (isStarted == true) {
            player.falling();
        }
    }

    public void stop(){
        isStarted = false;
    }
}


