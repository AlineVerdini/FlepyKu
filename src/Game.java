public class Game {

    private Controls controls;
    private Player player;
    private boolean isStarted;
    private Background background;
    private Piccolo piccolo;
    private PiccoloAttack piccoloAttack;
    private BarraStats barraStats;

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
        barraStats = new BarraStats(player,background);
    }

    public void start(){
        this.init();
        isStarted = true;
        while (isStarted == true) {
            player.falling();
            piccolo.move();
            piccoloAttack.moveLeft();
            damage();
        }
    }

    public void damage(){
        if(player.getPosX() + 155 >= piccoloAttack.getPosX() && player.getPosX() + 155 <= piccoloAttack.getPosX() + 30){
            if(piccoloAttack.getPosY() >= player.getPosY() && piccoloAttack.getPosY() <= player.getPosY() + 60){
                player.hit();
                piccoloAttack.delete();
                barraStats.loseLife();
            }
        }
    }

    public void stop(){
        isStarted = false;
    }
}


